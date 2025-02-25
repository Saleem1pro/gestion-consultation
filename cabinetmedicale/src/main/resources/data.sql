INSERT INTO medecin (nom, specialite) VALUES
('Dr. Ahmed Benali', 'Cardiologue'),
('Dr. Sarah Lahlou', 'Dentiste'),
('Dr. Youssef Mansouri', 'Généraliste');

INSERT INTO patient (nom, age, telephone) VALUES
('Omar El Idrissi', 45, '0601234567'),
('Fatima Zahra', 30, '0612345678'),
('Khalid Bennani', 50, '0623456789');

INSERT INTO consultation (date_consultation, description, reference, medecin_id, patient_id) VALUES
('2025-02-20', 'Consultation de routine', 'REF123456', 1, 1),
('2025-02-21', 'Douleur dentaire sévère', 'REF654321', 2, 2),
('2025-02-22', 'Suivi de l’hypertension', 'REF789012', 3, 3);

