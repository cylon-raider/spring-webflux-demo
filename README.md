# Spring WebFlux + React Fullstack Demo

This project demonstrates a fullstack application built using Spring Boot (WebFlux + R2DBC + MySQL) on the backend and React (with Vite and TailwindCSS) on the frontend.

## 📂 Project Structure

Spring Boot_WebFlux_Reactor3/
├── react_frontend/ # React Router + TailwindCSS Frontend
└── reactive_demo_backend/ # Spring Boot WebFlux Backend


## 🔧 Backend (Spring Boot)

- Reactive programming with WebFlux
- R2DBC with MySQL
- RESTful API endpoints
- Example model: `Greeting`

### Run the backend

```bash
cd reactive_demo_backend
./mvnw spring-boot:run

💻 Frontend (React + Vite)
React Router

TailwindCSS

TypeScript

Dark/light mode support

Run the frontend

cd react_frontend
npm install
npm run dev

🌐 API Endpoints
GET /api/greetings — List all greetings

POST /api/greetings — Create new greeting

GET /api/greetings/{id} — Get greeting by ID

PUT /api/greetings/{id} — Update greeting

DELETE /api/greetings/{id} — Delete greeting

🧰 Requirements

Java 17+

Node.js v18+

MySQL

Maven

