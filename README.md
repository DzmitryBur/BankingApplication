BankingApplication

1. Application idea:
- 1.1. Stage I: implementation of CRUD methods (GET-POST-PUT-DELETE) with working out table relationships (OneToMany, ManyToMany) in the database.
- 1.2. Stage II: expansion of functionality by the example of introducing transactions on accounts (related debit / credit operations) using control.
2. The application was implemented using: Spring Boot module, Maven framework, Lombok libraries, PostgreSQL DBMS, Swagger.
3. Table interaction scheme:

1. Идея приложения:
- 1.1. I этап: реализация работы CRUD методов (GET-POST-PUT-DELETE) с отработкой связей таблиц (OneToMany, ManyToMany) в БД.
- 1.2. II этап: расширение функционала на примере введения транзакций по счетам (связанные операции списание/зачисление) с использованием контроля.
2. Реализация приложения осуществлена с помощью: модуля Spring Boot, фреймворка Maven, библиотек Lombok, СУБД PostgreSQL, Swagger.
3. Схема взаимодействия таблиц:


![Tables](https://user-images.githubusercontent.com/96749989/182694857-fcea5776-4638-4c94-a7d4-74853bdaf77f.png)

How to work with the application:

1. It is necessary to implement the database in accordance with the attached table schema.
2. Customize the application.yml file depending on its properties.
3. You can test the application using:
- 3.1. postman;
- 3.2. Swagger-ui (http://localhost:****/swagger-ui/). **** - the port that is used on the local machine, for example 8080.


Порядок работы с приложением:

1. Необходимо реализовать БД в соответствии с приложенной схемой таблиц.
2. Настроить файл application.yml в зависимости от своих свойств.
3. Тестировать приложение можно с помощью:
- 3.1. Postman;
- 3.2. Swagger-ui (http://localhost:****/swagger-ui/). **** - порт, который используется на локальной машине, например 8080.
