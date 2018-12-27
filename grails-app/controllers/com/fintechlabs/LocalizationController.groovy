package com.fintechlabs

import com.fintechlabs.model.LocalizationCache

class LocalizationController {

    HazelCastConfigBean hazelCastConfigBean

    def index = {
        def localizationMap = hazelCastConfigBean.client.getMap("localizationMap")
        List<LocalizationCache> localizationCacheList = []
        localizationMap.each { element ->
            localizationCacheList << (element.value as LocalizationCache)
        }
        [localizationCacheList: localizationCacheList]
    }

}
