# HospiD-ieu

This is a training project to learn **Java**, **Spring** and **Angular**. It was done in group with [JuTournet](https://github.com/JuTournet), [ManuelVali77](https://github.com/ManuelVali77) and [MyleneCaudron](https://github.com/MyleneCaudron), during courses with the training organization Simplon.

This project is an hospital management application.

## Features

General :
- Person lists (patients or users)
- Text filter for person lists
- Login system with roles

Users can have one of three roles : administrator, medical secretary or nurse.

Admin :
- See user's list
- Create new users

Medical secretary :
- See patients lists
- Add new patient
- Edit patient data (name, address, etc.)
- Check patients in/out a medical department, room and bed ; this adds a record to the medical file

Nurse :
- See patients lists
- See a patient's medical file
- Add comments in a patient's medical file

## Technologies

- Java 17
- SpringBoot
- Angular 15
- MySQL

## How to run the app

This project isn't hosted online ; if you want to see what it's like, you will have to install and run the app locally.

### Requirements
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)
- [Maven](https://maven.apache.org/download.cgi)
- [Angular CLI](https://github.com/angular/angular-cli) version 15.1.2.
- [MySQL](https://dev.mysql.com/downloads/installer/)

### Downloading the project

Start by cloning the repository :
```bash
git clone https://github.com/StormLbn/HospiD-ieu.git
```

### Database connection
Use a script editor or terminal connect to MySQL, and create a database with name `hospidieu`.

### Backend configuration, build and run

In the `hospidieuBack` folder :
- Update file `hospidieuBack\src\main\resources\application.properties` with your database username and password.
- Build the project and collect dependencies :
```bash
mvn clean install
mvn dependency:copy-dependencies
```

*Note : DB tables are created during the build so it could take a little time.*

- Run the project :
```bash
cd target
java -jar hospidieuBack-0.0.1-SNAPSHOT.jar
```

### Fill database

DB tables and default users to test the app will be automatically created when building the app.
Default users' information appear in the console :
- Admin : admin@mail.com
- Medical secretary : secretaire@mail.com
- Nurse : infirmier@mail.com
- Password (for all) : test123

The app also needs hospital beds data, so use a script editor or terminal to run the script `db_script.sql` to add them, as well as some patients data.

### Frontend

In the `HospidieuFront` folder :
```bash
npm install
ng serve
```

The Angular app now runs on http://localhost:4200/.
