USE FToPayRespectsDB;

DROP TABLE IF EXISTS JobRoles;
DROP TABLE IF EXISTS JobDiscipline;
DROP TABLE IF EXISTS JobCapability;
DROP TABLE IF EXISTS JobBand;

CREATE TABLE JobBand (
    JobBandID INT NOT NULL PRIMARY KEY,
    JobBand VARCHAR(100) NOT NULL
);

CREATE TABLE JobCapability (
	JobCapabilityID INT NOT NULL PRIMARY KEY,
    JobCapability VARCHAR(100) NOT NULL
);


CREATE TABLE JobDiscipline (
 JobDisciplineID INT NOT NULL PRIMARY KEY,
 JobDiscipline VARCHAR(100) NOT NULL
);

CREATE TABLE JobRoles (
    JobRoleID INT NOT NULL PRIMARY KEY auto_increment,
    JobTitle VARCHAR(200) NOT NULL,
    JobSpecification VARCHAR(5000) NOT NULL,
	JobDiscipline INT NOT NULL,
    JobBand INT NOT NULL,
    JobCapability INT NOT NULL,
    JobCompetencies VARCHAR(5000),
    JobProfileLink VARCHAR(500),
    RecordCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE JobRoles ADD CONSTRAINT FK_JobDiscipline FOREIGN KEY (JobDiscipline) references JobDiscipline (JobDisciplineID);
ALTER TABLE JobRoles ADD CONSTRAINT FK_JobCapability FOREIGN KEY (JobCapability) references JobCapability(JobCapabilityID);
ALTER TABLE JobRoles ADD CONSTRAINT FK_JobBand FOREIGN KEY (JobBand) references JobBand (JobBandID);

