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
                    <h5 class="card-title">Create Person</h5>
                </div>

                <div class="col-lg-2">
                    <div class="text-right">
                        <a class="btn btn-outline-primary btn-sm"
                           href="${createLink(controller: 'personDomain', action: 'index')}">Person List</a>
                    </div>
                </div>
            </div>

            <form method="post" action="${createLink(controller: 'personDomain', action: 'save')}">
                <div class="row">
                    <div class="form-group col-lg-6">
                        <label for="firstName">First Name</label>
                        <input type="text" class="form-control" name="firstName" id="firstName"
                               placeholder="Enter First Name">
                    </div>

                    <div class="form-group col-lg-6">
                        <label for="lastName">Last Name</label>
                        <input type="text" class="form-control" name="lastName" id="lastName"
                               placeholder="Enter Last Name">
                    </div>
                </div>

                <div class="row">
                    <div class="form-group col-lg-6">
                        <label for="emailAddress">Email Address</label>
                        <input type="email" class="form-control" name="emailAddress" id="emailAddress"
                               placeholder="Enter Email Address">
                    </div>

                    <div class="form-group col-lg-6">
                        <label for="phoneNumber">Phone Number</label>
                        <input type="tel" class="form-control" name="phoneNumber" id="phoneNumber"
                               placeholder="Enter Phone Number">
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>