# Hello world
A curated list  of classic 'Hello world!' programs, mostly written in Java or Javascript. 

### [node-mongo](https://github.com/cicilthomas/hello-world/tree/master/node-mongo)
An attempt to learn Node.js and MongoDb. This one performs basic CURD operations on a user registry. There are some blocking requests, so beware of that. 

### [aws-lex-lambda](https://github.com/cicilthomas/hello-world/tree/master/aws-lex-lambda) (spring-boot)
A sample AWS lambda spring-boot function which accepts AWS Lex requests and respond with the current server time. In order make this work you have to create a Lex bot with an Yes or No Slot. When the user says Yes this lambda  function returns with the current server time.

#### Sample Output in Lex
```sh
Me: Hello Bot 
Bot: Do you want know the time?
Me: Yes
Bot: The current time is 15:04 
```
In addition to the current time response, it also tells whether the AWS Lambda container was resued. It is completely upto AWS whether to reuse the contianer where the previous Lambda function call was executed.  


