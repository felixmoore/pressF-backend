SELECT * FROM JobBand;

SELECT * FROM JobCapability;

SELECT * FROM JobRoles;

SELECT JobRoleID, JobTitle, jc.JobCapability, jb.JobBand, JobCompetencies, RecordCreated FROM JobRoles 
JOIN JobBand jb ON JobRoles.JobBand = jb.JobBandID 
JOIN JobCapability jc ON JobRoles.JobCapability = jc.JobCapabilityID;



INSERT INTO JobBand VALUES (2,'Leadership');
INSERT INTO JobBand VALUES (3,'Principle');
INSERT INTO JobBand VALUES (4,'Manager');
INSERT INTO JobBand VALUES (5,'Consultant');
INSERT INTO JobBand VALUES (6,'Senior Associate');
INSERT INTO JobBand VALUES (7,'Associate');
INSERT INTO JobBand VALUES (8, 'Trainee');
INSERT INTO JobBand VALUES (9, 'Apprentice');
INSERT INTO JobBand VALUES (10, 'Other');

INSERT INTO JobCapability VALUES (2, 'Engineering, Strategy & Planning');
INSERT INTO JobCapability VALUES (3, 'Engineering');
INSERT INTO JobCapability VALUES (4, 'Architecture');
INSERT INTO JobCapability VALUES (5, 'Testing & Quality Assurance');
INSERT INTO JobCapability VALUES (6, 'Product Specialist');
INSERT INTO JobCapability VALUES (7, 'Other');


INSERT INTO JobRoles (JobRoleID, JobTitle, JobSpecification, JobCapability, JobBand, JobCompetencies) VALUES (2, '(CTO) Chief Technology Officer', 'Technology Lead', 2, 2, 'Technology Lead');


