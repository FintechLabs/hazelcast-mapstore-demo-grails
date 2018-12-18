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
                    <h5 class="card-title">Person List</h5>
                </div>

                <div class="col-lg-2">
                    <div class="text-right">
                        <a class="btn btn-outline-primary btn-sm"
                           href="${createLink(controller: 'personDomain', action: 'create')}">Create</a>
                    </div>
                </div>
            </div>
            <g:if test="${personList}">
                <table class="table">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">First Name</th>
                        <th scope="col">Last Name</th>
                        <th scope="col">Email Address</th>
                        <th scope="col">Phone Number</th>
                        <th scope="col">UniqueId</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${personList}" var="person" status="i">
                        <tr>
                            <th>${i + 1}</th>
                            <td>${person?.getFirstName()}</td>
                            <td>${person?.getLastName()}</td>
                            <td>${person?.getEmailAddress()}</td>
                            <td>${person?.getPhoneNumber()}</td>
                            <td>${person?.getUniqueId()}</td>
                            <td>
                                <a href="${createLink(controller: 'personDomain', action: 'show', id: person.getUniqueId())}"
                                   class="text-danger"><i class="fa fa-info-circle"></i></a>&nbsp;|&nbsp;
                                <a href="${createLink(controller: 'personDomain', action: 'delete', id: person.getUniqueId())}"
                                   class="text-danger"><i class="fa fa-trash"></i></a>
                            </td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </g:if>
            <g:else>
                <div class="alert alert-danger text-center" role="alert">
                    No Data Found!
                </div>
            </g:else>
        </div>
    </div>
</div>
</body>
</html>