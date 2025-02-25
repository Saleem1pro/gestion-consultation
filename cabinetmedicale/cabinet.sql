CREATE DATABASE cabinet_medical;
USE cabinet_medical;

CREATE TABLE medecin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    specialite VARCHAR(100) NOT NULL
);

CREATE TABLE patient (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    telephone VARCHAR(20) NOT NULL);
    
CREATE TABLE consultation (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date_consultation DATE NOT NULL,
    description TEXT NOT NULL,
    reference VARCHAR(50) UNIQUE NOT NULL,
    medecin_id INT NOT NULL,
    patient_id INT NOT NULL,
    FOREIGN KEY (medecin_id) REFERENCES medecin(id) ON DELETE CASCADE,
    FOREIGN KEY (patient_id) REFERENCES patient(id) ON DELETE CASCADE
);

INSERT INTO medecin (nom, specialite,email) VALUES 
('Dr. Ahmed Benali', 'Cardiologue','benali@hotmail.com'),
('Dr. Sarah Lahlou', 'Dentiste','lahlou@yahoo.fr'),
('Dr. Youssef Mansouri', 'Généraliste','mansouri@caramail.com');

INSERT INTO patient (nom, age, telephone) VALUES 
('Omar El Idrissi', 45, '0601234567'),
('Fatima Zahra', 30, '0612345678'),
('Khalid Bennani', 50, '0623456789');

INSERT INTO consultation (date_consultation, description, reference, medecin_id, patient_id) VALUES 
('2025-02-20', 'Consultation de routine', 'REF123456', 1, 1),
('2025-02-21', 'Douleur dentaire sévère', 'REF654321', 2, 2),
('2025-02-22', 'Suivi de l’hypertension', 'REF789012', 3, 3);


select * from medecin;
select * from patient;
select * from consultation;

drop database cabinet_medical;