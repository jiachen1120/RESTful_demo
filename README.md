# RESTful_demo
This is a sample Java / Maven / Spring Boot application that can be used as a starter for creating RESTful APIs which able to list users' information and create new user. I hope it helps you.

# How to Run
1. Clone this repository
2. Make sure you are using JDK 1.8 and Maven 3.x
3. Config your own database just like following
```
-- ----------------------------
-- Table structure for jc_home
-- ----------------------------
DROP TABLE IF EXISTS `jc_home`;
CREATE TABLE `jc_home` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
```
4. Run `App.java` as spring boot app in your fevorite IDE
5. Access `http://localhost:8080/info`

# About the Service
The service is just a simple REST service. It uses MySQL database to store the data.

1. Get list of users' information including their firstname, lastname and email address by http method `GET`
The expected response should be
```
{
    "STATUS": "SUCCESS",
    "USER_LIST": [
        {
            "id": 1,
            "firstname": "xxx",
            "lastname": "xxx",
            "email": "xxx@gmail.com"
        },
        {
            "id": 2,
            "firstname": "yyy",
            "lastname": "yyy",
            "email": "yyy@gmail.com"
        }
    ]
}
```

2. Create new user and add it to database by http method `POST`
i.e. 
The request is
```
{
    "firstname" : "xxx",
    "lastname" : "xxx",
    "email" : "xxx@xxx.com",
}
```
The expected response should be 
```
{
    "STATUS" : "SUCCESS",
}
```
