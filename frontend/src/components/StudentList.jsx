import React, { useEffect, useState } from "react";
import { fetchStudents } from "../api/studentApi";

export default function StudentList() {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    fetchStudents().then((res) => setStudents(res.data));
  }, []);

  return (
    <ul>
      {students.map((s) => (
        <li key={s.id}>{s.name}</li>
      ))}
    </ul>
  );
}
