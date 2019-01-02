<html>
<head>
    <meta name="layout" content="main">
</head>

<body>
<div class="container">
    <div class="card">
        <div class="card-body">
            <div class="row">
                <div class="col">
                    <h5 class="card-title">Localization List</h5>
                </div>

                <div class="col-lg-2">
                    <div class="text-right">
                        <a class="btn btn-outline-primary btn-sm"
                           href="${createLink(controller: 'personDomain', action: 'create')}">Create</a>
                    </div>
                </div>
            </div>
            <g:if test="${localizationCacheList}">
                <table class="table">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Id</th>
                        <th scope="col">Tenant Id</th>
                        <th scope="col">Dated</th>
                        <th scope="col">Code</th>
                        <th scope="col">Value</th>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${localizationCacheList}" var="localizationCache" status="i">
                        <tr>
                            <th>${i + 1}</th>
                            <th>${localizationCache.getId()}</th>
                            <td>${localizationCache.getTenantId()}</td>
                            <td>${localizationCache.getDateCreated().format("MMM dd, yyyy")}</td>
                            <td>${localizationCache.getCode()}</td>
                            <td>${localizationCache.getText()}</td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>

                <div id="localisationPaginate" class="pull-right">
                    <helperTG:paginate controller="localization" action="index" total="${totalCount}" max="50"/>
                </div>
            </g:if>
            <g:else>
                <div class="alert alert-danger text-center" role="alert">
                    No Data Found!
                </div>
            </g:else>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        $("#localisationPaginate").find("a").addClass("btn btn-primary").after("&nbsp;");
        $("#localisationPaginate").find("span").addClass("btn btn-primary disabled").after("&nbsp;");
    });
</script>
</body>
</html>