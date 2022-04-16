# booking-service

This service is used to check the availabiltiy of the container of specified requirment 

once the spring boot project deployed, following url can be used to 
localhost:8080/api/bookings/checkAvailable with requestbody 

{
“containerType” : “DRY”,
“containerSize” : 20,
“origin” : “Southampton”,
“destination” : “Singapore”,
“quantity” : 5
}


technology stack -

Java8,
webflux,
springboot - 2.6.6

                          
                          
