USE FToPayRespectsDB;

DROP TABLE IF EXISTS JobRoles;
DROP TABLE IF EXISTS JobDiscipline;
DROP TABLE IF EXISTS JobCapability;
DROP TABLE IF EXISTS JobBand;
DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
	UserEmail VARCHAR(300) NOT NULL PRIMARY KEY,
	UserPassword VARCHAR(256) NOT NULL,
    UserRole BOOL NOT NULL
);

CREATE TABLE JobBand (
    JobBandID INT NOT NULL PRIMARY KEY auto_increment,
    JobBand VARCHAR(100) NOT NULL,
    JobBandTraining varchar(2000)
);

CREATE TABLE JobCapability (
    JobCapabilityID INT NOT NULL PRIMARY KEY auto_increment,
    JobCapability VARCHAR(100) NOT NULL
);

CREATE TABLE JobDiscipline (
    JobDisciplineID INT NOT NULL PRIMARY KEY auto_increment,
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

ALTER TABLE JobRoles ADD CONSTRAINT FK_JobDiscipline FOREIGN KEY (JobDiscipline) REFERENCES JobDiscipline (JobDisciplineID);
ALTER TABLE JobRoles ADD CONSTRAINT FK_JobCapability FOREIGN KEY (JobCapability) REFERENCES JobCapability(JobCapabilityID);
ALTER TABLE JobRoles ADD CONSTRAINT FK_JobBand FOREIGN KEY (JobBand) REFERENCES JobBand (JobBandID);

CREATE TABLE JobRoleResponsibilities (
	JobRoleResponsibilityID INT NOT NULL PRIMARY KEY auto_increment,
	JobRoleID INT NOT NULL,
    JobRoleResponsibility VARCHAR(1000) NOT NULL,
    
    CONSTRAINT FK_JobRole FOREIGN KEY (JobRoleID) REFERENCES JobRoles (JobRoleID)
);

