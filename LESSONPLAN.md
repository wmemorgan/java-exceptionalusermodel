#### Entry Ticket

Please take a moment to reflect on what you have previously learned and hope to learn by completing this Google Survey. Remember your responses will be read by your instructor to help guide future lessons.

* [Guided Project Entry Ticket](https://forms.gle/TM3SE5sLUTWpSSG9A)

#### Daily Resources

* [Guided Project Initial Version](https://github.com/LambdaSchool/java-exceptionalusermodel/tree/master/usermodel-initial)
* [Slido](https://app.sli.do/event/XXXXXXXX)
* [Zoom like](https://lambdaschool.zoom.us/j/#########)

#### Slack Message

@channel
Let's do this! The Java Class will be starting in 3 minutes at (https://lambdaschool.zoom.us/j/#########)
Please post questions to the Slido link at (https://app.sli.do/event/XXXXXXXX)

### Introduction and Hook

Today we concentrate on making our applications look like we know what we are doing! We provide better exception messages to our clients. we provide data validation so WHEN our clients send us bad data, we reject is - with a nice readable message of course! We also show data science we can work with them by learning how to get data from other APIs. So, let's make us look good!

### Purpose

Add fanciness to our applications

* Readable exception messages
* Data Validation
* Data from other APIs

### Learning Activities

#### Working with Objective: implement industry-standard exception handling including user-friendly exception messages

* Add lines to application.properties to turn off error handling
* The following can be treated as boilerplate code and just given students if time is an issue
  * Add model `ErrorDetail`
  * Add model `ValidationError`
  * Add `handlers` subpackage
  * Add `HelperFunctions` - `getConstraintViolation`
  * Add `exceptions` subpackage
  * Add `CustomErrorDetails`
  * Add `RestExceptionHandler.handleExceptionInternal`
  * Show exception responses
  * Add `ResourceNotFoundException`
  * Add `ResourceFoundException`
  * Replace `EntityNotFoundException` with `ResourceNotFoundException`
  * Replace `EntityExistsException` with `ResourceFoundException`
  * Show exception responses

* [Check for Understanding CFU - Google Form](https://forms.gle/sqgQFMgwmNifbuK37)

#### Working with Objective: implement exception handling using a variety of Java constructs

Add file scanner code to the main application.

* [Check for Understanding CFU - Google Form](https://forms.gle/3MzFyfcS1UbU1Nsz7)

#### Working with Objective: use data validation annotations to verify data prior to processing the data

Note: Adding NotNull aids in exception reporting.

* In Role Model add `@NotNull`
* In User model add `@NotNull` and `@Size`
* In Useremail model add `@NotNull` and point out `@Email`
* Try adding password that is too short

[PATCH http://localhost:2019/users/user/15](http://localhost:2019/users/user/15)

For request body use

```JSON
{
    "password" : "ABC"
}
```

* [Check for Understanding CFU - Google Form](https://forms.gle/GHnGMukCGmDmuCdU6)

#### Working with Objective: implement custom Swagger Documentation

* Add Swagger Validation dependency to POM.XML
* Add Swagger Validation import to Swagger2Config
* Add User model documentation
* Add User Controller documentation
* Adjust the amount to add based on time available

* [Check for Understanding CFU - Google Form](https://forms.gle/pPLAV3dQNY141YnJ7)

#### Working with Objective: gather and use data from other APIs

* Add model `CountryData`
* Add Model `Currency`
* Add `ourCountryData` to `HelperFunctions`
* Add `CountryDataController`
  * Controller to Populate Data
  * Controller to Read Data

* [Check for Understanding CFU - Google Form](https://forms.gle/2oXdYDv5bpD1WKCK6)

## Closing

### Conclusion

#### Review what we just learned

* Improving exception handling
* Validating data we get from clients
* Getting data from other APIs

#### How is this related to tomorrow's topic

* We will continue adding functionality to make a better, more professional API!
* We will add user authentication!

### Exit Ticket

Please take a moment to reflect on what you have learned in today's Guided Project. Remember your response will be read by your instructor to help guide future lessons.

* [Guided Project Exit Ticket](https://forms.gle/KXdWXFX2ojQqJLv19)
