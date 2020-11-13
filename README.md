# test-task
AngularJs and Spring Boot<br>
Создать базу данных. В качестве базы данных используется PostgreSQL или H2 (in memory). ORM - Hibernate. В качестве бэка использовать Java + Spring Boot. Бэкенд предоставляет REST API для работы с базой. Работа с базой через spring-data. REST API должен иметь все CRUD методы работы с пользователями.

<br>Фронтенд на AngularJS v1.7 позволяет просматривать список пользователей и каждого в отдельности. (Только read).
<br>Выложить результат в git. 
К проекту приложить инструкцию по деплою.

Структура объектов в JSON:

User: {
	id: string,
	firstName: string,
	lastName: string,
	orders: []Order
}

Order: {
	id: string,
	serviceName: string,
	targetUrl: string,
	price: number
}

Нужно реализовать следующие эндпоинты  на фронте
/user
	GET: returns all userObjects
/user/$ID ($ID - числовой параметр)
	GET: returns userObject
