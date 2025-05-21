import axios from "axios";
const api = axios.create({ baseURL: "/api/v1/students" });
export const fetchStudents = () => api.get("/");
export const createStudent = (data) => api.post("/", data);
