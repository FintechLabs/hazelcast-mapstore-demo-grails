package com.fintechlabs

import com.fintechlabs.model.LocalizationCache
import com.hazelcast.query.PagingPredicate
import com.hazelcast.query.Predicate
import com.hazelcast.query.Predicates

class LocalizationController {

    HazelCastConfigBean hazelCastConfigBean

    def index = {
        params.max = params.max ?: 50
        if (params.long('page')) {
            params.offset = (params.long('page') - 1) * params.max
        }
        Integer pageNum = params.page ? params.int("page") : 1
        println("************       Params  ===>>>      ${params}")
        def localizationMap = hazelCastConfigBean.client.getMap("localizationDomainMap")
        Predicate equalPredicate = Predicates.equal("tenantId", 1L)
        PagingPredicate pagingPredicate = new PagingPredicate(equalPredicate, params.int("max"))
        pagingPredicate.setPage(pageNum - 1)
        Collection<LocalizationCache> localizationCacheCollection = localizationMap.values(pagingPredicate)
        [localizationCacheList: localizationCacheCollection, totalCount: localizationMap.size()]
    }

    def show = {}

}
