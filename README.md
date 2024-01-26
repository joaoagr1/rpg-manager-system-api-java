# 🚀 D&D Sheet Manager System

The RPG Character Sheet Management API is designed to streamline the process of managing character sheets for role-playing games (RPGs). It provides endpoints for creating, updating, retrieving, and deleting character sheets, as well as functionalities such as character stats tracking, inventory management, and character progression. This API serves as a centralized platform for players and game masters to efficiently manage their characters, enabling seamless integration with the D&D 5e system.

## 🔍 Summary

1. [Prerequisites](#prerequisites) 📋
2. [Installation](#installation) 🛠️
3. [Configuration](#configuration) ⚙️
4. [Usage](#usage) 🚀
5. [Endpoints](#endpoints) 🛣️
6. [Contribution](#contribution) 🤝
7. [License](#license) 📝

## Prerequisites

Before you begin, make sure you have the following prerequisites installed and set up:

- **Java Development Kit (JDK)**: Install JDK 11 or higher. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use OpenJDK.
- **Apache Maven**: Install Apache Maven, a build automation tool used primarily for Java projects. You can download it from the [Apache Maven website](https://maven.apache.org/download.cgi).
- **Spring Boot**: Ensure you have Spring Boot set up. You can include Spring Boot dependencies in your Maven `pom.xml` file.
- **MySQL Database**: Set up a MySQL database instance for storing character data. You can download MySQL Community Server from the [MySQL website](https://dev.mysql.com/downloads/mysql/) or use a cloud-based service like Amazon RDS or Google Cloud SQL.
- **Git**: Install Git to clone the repository and manage version control. You can download it from the [Git website](https://git-scm.com/).

## Installation

To install and set up the RPG Character Management API, follow these steps:

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```

2. Navigate to the API directory:

    ```bash
    cd your-repository
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

   This will download dependencies and build the project. Ensure that you have Maven installed on your machine. If you haven't installed Maven yet, you can download it from the [Apache Maven website](https://maven.apache.org/download.cgi).

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

   The API should now be running locally at `http://localhost:8080`. Make sure all configurations are set up correctly before using the API in a production environment.

## Usage

To start the local server, run the following command:

```bash
java -jar your-application.jar
```
Access the API at: http://localhost:8080 (or the configured port)

Ensure all configurations have been set up correctly before using the API in a production environment.

## Endpoints

![image](https://github.com/joaoagr1/rpg-manager-system-api-java/assets/125477822/ad23bf75-82b6-450e-b98d-c7d83a7e079f)


## Contribution

If you want to contribute to the project, follow the steps below:
1. Fork the project
2. Create a new branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a new Pull Request

## License

[Insert the license used for the project.]

Feel free to customize this README according to the specific needs of your API, adding more details, code examples, and relevant information for users and contributors.
