USE FToPayRespectsDB;

CREATE TABLE JobBand (
    JobBandID INT NOT NULL PRIMARY KEY,
    JobBand VARCHAR(100)
);

CREATE TABLE JobCapability (
	JobCapabilityID INT NOT NULL PRIMARY KEY,
    JobCapability VARCHAR(100)
);

CREATE TABLE JobRoles (
    JobRoleID INT NOT NULL PRIMARY KEY auto_increment,
    JobTitle VARCHAR(200) NOT NULL,
    JobSpecification VARCHAR(5000) NOT NULL,
    JobBand INT NOT NULL,
    JobCapability INT NOT NULL,
    JobCompetencies VARCHAR(5000),
    RecordCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

  ALTER TABLE JobRoles ADD CONSTRAINT FK_JobCapability FOREIGN KEY (JobCapability) references JobCapability(JobCapabilityID);
ALTER TABLE JobRoles ADD CONSTRAINT FK_JobBand FOREIGN KEY (JobBand) references JobBand (JobBandID);


DROP TABLE JobRoles;