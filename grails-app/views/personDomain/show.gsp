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
                    <h5 class="card-title">Person Details</h5>
                </div>

                <div class="col-lg-2">
                    <div class="text-right">
                        <a class="btn btn-outline-primary btn-sm"
                           href="${createLink(controller: 'personDomain', action: 'index')}">Person List</a>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-6">
                    <p><b>First Name:</b>${person?.getFirstName()}</p>
                </div>

                <div class="col-lg-6">
                    <p><b>Last Name:</b>${person?.getLastName()}</p>
                </div>

                <div class="col-lg-6">
                    <p><b>Email Address:</b>${person?.getEmailAddress()}</p>
                </div>

                <div class="col-lg-6">
                    <p><b>Phone Number:</b>${person?.getPhoneNumber()}</p>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>