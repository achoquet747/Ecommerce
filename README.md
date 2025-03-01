# sportshop


## Getting started

## Clone the repository

```
git clone https://gitlab.com/arielPuma/sportshop.git

```

## BACKEND
```
cd backend
```

Configure the database credentials in the application.properties file, located at:
```
src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/sportshop
spring.datasource.username=user
spring.datasource.password=password

```
> [!NOTE]
> For the image resource the project use aws, please create a free account and configure the credential in the application.properties file and AwsS3Service file add the name of the bucket. 
```
# SecretKey
secreteJwtString = arieledso123456789arieledso123456789

# aws Access key ID
aws.s3.access=AccesskeyID

# aws Secret access key
aws.s3.secrete=Secretaccesskey
```


### BACKEND BUILD

```
mvn clean install
mvn spring-boot:run
```

> [!IMPORTANT]
> You need to have an admin user already created for the function of admin in the app, you can use POSTMAN for that

```
POST localhost:2424/auth/register
EXAMPLE

{
    "email":"arielpuma@gmail.com", 
    "name" : "ariel puma",
    "phoneNumber" : "72736712",
    "password" : "arielpuma",
    "role" : "ADMIN"
}
```

## FRONTEND

```
cd Frontend
npm install
npm start
```


> [!NOTE]
> Be sure to have MySql with the database sportshop
> Be sure to have Java 21 and Maven installed