USE hospidieu;

INSERT INTO patients
    (name, firstname, birth_date, address, postcode, city, phone, security_number)
VALUES
    ('Doe','Jane', '1980-01-01', 'Inconnue', 99000, 'Fakeville' ,'0600000000', '2000000000000'),
    ('Dupont','Jacques', '1972-02-28', '123 rue Bidon', 99000, 'Fakeville' ,'0312345678', '1234567890123'),
    ('Dupont','Micheline', '1974-08-02', '123 rue Bidon', 99000, 'Fakeville' ,'0312345678', '2234567890123'),
    ('Leclercq','Michel', '1966-10-30', '27 rue Bidon', 99000, 'Fakeville' ,'0309876543', '1098765433321'),
    ('Dialo','Mamadou', '1991-09-10', '1 rue du foot', 59000, 'Lille' ,'0612345678', '1098765432198'),
    ('Majorczyk','Nicolas', '1993-02-17', '1 rue du rock', 59000, 'Lille' ,'0612335678', '1098765473198'),
    ('Masset','Marina', '1990-04-22', '1 rue du Japon', 59000, 'Lille' ,'0612998678', '2098765992198'),
    ('Duck','Riri', '2018-04-04', '4 rue Disney', 99000, 'Fakeville' ,'0399999999', '1999999999999'),
    ('Duck','Fifi', '2018-04-04', '4 rue Disney', 99000, 'Fakeville' ,'0399999999', '1999999999998'),
    ('Duck','Loulou', '2018-04-04', '4 rue Disney', 99000, 'Fakeville' ,'0399999999', '2999999999997');

INSERT INTO beds
    (bed_number, room_number, department, ID_patient)
VALUES
    (1, 1, 'Urgences', 1),
    (2, 1, 'Urgences', null),
    (3, 1, 'Urgences', null),
    (4, 1, 'Urgences', null),
    (1, 2, 'Urgences', null),
    (2, 2, 'Urgences', null),
    (3, 2, 'Urgences', null),
    (1, 3, 'Urgences', null),
    (2, 3, 'Urgences', null),
    (3, 3, 'Urgences', null),
    (1, 11, 'Traumatologie', null),
    (2, 11, 'Traumatologie', null),
    (1, 12, 'Traumatologie', null),
    (2, 12, 'Traumatologie', null),
    (1, 21, 'Pédiatrie', 10),
    (1, 22, 'Pédiatrie', 9),
    (1, 23, 'Pédiatrie', null),
    (1, 24, 'Pédiatrie', null),
    (1, 31, 'Maternité', null),
    (1, 32, 'Maternité', null),
    (1, 33, 'Maternité', null),
    (1, 34, 'Maternité', null),
    (1, 101, 'Cardiologie', 3),
    (2, 101, 'Cardiologie', null),
    (1, 102, 'Neurologie', null),
    (2, 102, 'Neurologie', null),
    (1, 111, 'Médecine générale', null),
    (2, 111, 'Médecine générale', null),
    (1, 112, 'Médecine générale', null),
    (2, 112, 'Médecine générale', null),
    (1, 201, 'Chirurgie', null),
    (2, 201, 'Chirurgie', null),
    (1, 202, 'Chirurgie', null),
    (2, 102, 'Chirurgie', null);

INSERT INTO monitorings
    (ID_patient, comment, symptom, date, ID_user)
VALUES
    (2, 'Patient admis au service Cardiologie, chambre 101 lit 1', null, '2022-12-22', 3),
    (2, 'Diagnostique : problème cardiaque. Nécessite une greffe en urgence.', 'Problème cardiaque', '2022-12-22', 2),
    (2, 'Greffe de coeur', null, '2022-12-28', 2),
    (2, 'Convalescence', null, '2022-12-29', 2),
    (2, 'Patient sorti du service Cardiologie, chambre 101 lit 1', null, '2023-01-09', 3),
    (1, 'Patient admis au service Urgences, chambre 1 lit 1', null, '2023-03-06', 3),
    (9, 'Patient admis au service Pédiatrie, chambre 22 lit 1', null, '2023-03-04', 3),
    (10, 'Patient admis au service Pédiatrie, chambre 21 lit 1', null, '2023-03-04', 3),
    (9, 'Diagnostic', 'Varicelle', '2023-03-04', 2),
    (10, 'Diagnostic', 'Varicelle', '2023-03-04', 2),
    (3, 'Patient admis au service Cardiologie, chambre 102 lit 1', null, '2023-02-28', 3),
    (3, 'Diagnostic non concluant, patient gardé en observation', null, '2023-02-28', 2);
