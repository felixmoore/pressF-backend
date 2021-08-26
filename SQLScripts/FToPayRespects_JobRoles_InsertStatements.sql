SELECT * FROM JobBand;

SELECT * FROM JobCapability;

SELECT * FROM JobRoles;

SELECT JobRoleID, JobTitle, JobSpecification, jc.JobCapability, jd.JobDiscipline, jb.JobBand, JobCompetencies, RecordCreated FROM JobRoles 
JOIN JobBand jb ON JobRoles.JobBand = jb.JobBandID 
JOIN JobDiscipline jd ON JobRoles.JobDiscipline = jd.JobDisciplineID 
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


INSERT INTO JobCapability VALUES (1, 'Platforms');
INSERT INTO JobCapability VALUES (2, 'Data');
INSERT INTO JobCapability VALUES (3, 'Engineering');
INSERT INTO JobCapability VALUES (4, 'Artificial Intelligence');
INSERT INTO JobCapability VALUES (5, 'Cyber Security');
INSERT INTO JobCapability VALUES (6, 'Workday');
INSERT INTO JobCapability VALUES (7, 'Experience Design');
INSERT INTO JobCapability VALUES (8, 'Product');
INSERT INTO JobCapability VALUES (9, 'Delivery');
INSERT INTO JobCapability VALUES (10, 'Operations');
INSERT INTO JobCapability VALUES (11, 'Business Development and Marketing');
INSERT INTO JobCapability VALUES (12, 'Organisational Strategy and Planning');
INSERT INTO JobCapability VALUES (13, 'People');
INSERT INTO JobCapability VALUES (14, 'Commercial and Financial Marketing');
INSERT INTO JobCapability VALUES (15, 'Business Services Support');


INSERT INTO JobDiscipline VALUES (2, 'Engineering, Strategy & Planning');
INSERT INTO JobDiscipline VALUES (3, 'Engineering');
INSERT INTO JobDiscipline VALUES (4, 'Architecture');
INSERT INTO JobDiscipline VALUES (5, 'Testing & Quality Assurance');
INSERT INTO JobDiscipline VALUES (6, 'Product Specialist');
INSERT INTO JobDiscipline VALUES (7, 'Other');


INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies) VALUES ('(CTO) Chief Technology Officer', 'Technology Lead', 3, 2, 2, 'Technology Lead');
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies) VALUES ('Innovation Lead', 'As an Innovation Lead (Consultant) in Kainos, you’ll be responsible will lead the team, working with the Innovation Lead in a dynamic and hands-on role which will involve managing and developing the team, implementing and shaping Kainos’ innovation strategy and effectively communicating the exciting work we undertake both internally and within the wider technology community.', 3, 2, 5, 'Intermediate');


