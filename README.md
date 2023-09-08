
# Movie Application Backend

This is the backend code for the Movie Application, a web application built using Spring Boot and MongoDB. It provides APIs for managing movie data.

## Features

- View a list of movies
- Search for movies by title, genre, or release year
- Add new movies to the database
- Update movie details
- Delete movies from the database

## Technologies Used

- Spring Boot: A Java-based framework for building robust and scalable web applications.
- MongoDB: A NoSQL document database for storing movie data.

## Getting Started

To run the backend of the movie application locally, follow these steps:

### Prerequisites

Make sure you have Java and Maven installed on your machine.

### Installation

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/your-username/movie-application.git


2. Navigate to the root directory of this project (where your Spring Boot project is located).

3. Build the Spring Boot application using the following Maven command:
   
  ```bash
     mvn clean install
 ```
   
### Running the Application

After the build is successful, you can run the Spring Boot application with the following command
    
    java -jar target/movie-application.jar
    
The backend server will start, and it will be accessible at the configured port (usually http://localhost:8080 unless you've changed it in the application.properties file).
