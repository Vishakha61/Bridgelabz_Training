// Ques2. Display the doctor who has handled the maximum number of appointments
SELECT d.doctor_name, d.specialization, COUNT(*) AS total_appointments
FROM doctors d JOIN appointment a ON d.doctor_id = a.doctor_id
GROUP BY d.doctor_id, d.doctor_name, d.specialization
ORDER BY total_appointments DESC LIMIT 1;

//Ques3. Display the number of doctors available in each department in descending order
SELECT department_name, COUNT(*) AS doctor_count
FROM department d JOIN doctors doc ON d.department_id = doc.department_id
GROUP BY department_name
ORDER BY doctor_count DESC;

//Ques4. Display patients who have visited more than three times
SELECT p.patient_name, COUNT(*) AS total_appointments
FROM patient p JOIN appointment a ON p.patient_id = a.patient_id
GROUP BY p.patient_id, p.patient_name
HAVING COUNT(*) > 3;

//Ques5. Display doctors who have never received an appointment
SELECT doctor_name, specialization
FROM doctors
WHERE doctor_id NOT IN (SELECT doctor_id FROM appointment);