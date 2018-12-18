# Hazelcast MapStore Demo Grails
* First compile and build project mentioned below to get jar file from there:
https://github.com/FintechLabs/hazelcast-mapstore
* Paste the jar files into lib folder of this project
* Now run the project to expore Hazelcast MapStore

# Working
* Load all the keys from the configured Database in above mentioned HazelCast MapStore application into running HazelCast nodes.
* On creating any person record from this Grails app that record would be stored into the Hazelcast node first and then into the database using the store() method of Hazelcast's MapStore.
* Same goes to update, delete and list operations.