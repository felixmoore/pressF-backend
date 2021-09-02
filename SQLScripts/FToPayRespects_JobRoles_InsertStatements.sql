USE FToPayRespectsDB;

SELECT * FROM JobBand;

SELECT * FROM JobCapability;

SELECT * FROM JobDiscipline;

SELECT * FROM JobRoles;

INSERT INTO JobBand VALUES (0, 'Leadership');
INSERT INTO JobBand VALUES (1, 'Principle');
INSERT INTO JobBand VALUES (2, 'Manager');
INSERT INTO JobBand VALUES (3, 'Consultant');
INSERT INTO JobBand VALUES (4, 'Senior Associate');
INSERT INTO JobBand VALUES (5, 'Associate');
INSERT INTO JobBand VALUES (6, 'Trainee');
INSERT INTO JobBand VALUES (7,'Apprentice');
INSERT INTO JobBand VALUES (8, 'Other');

INSERT INTO JobCapability VALUES (0, 'Platforms');
INSERT INTO JobCapability VALUES (1, 'Data');
INSERT INTO JobCapability VALUES (2, 'Engineering');
INSERT INTO JobCapability VALUES (3, 'Artificial Intelligence');
INSERT INTO JobCapability VALUES (4, 'Cyber Security');
INSERT INTO JobCapability VALUES (5, 'Workday');
INSERT INTO JobCapability VALUES (6, 'Experience Design');
INSERT INTO JobCapability VALUES (7, 'Product');
INSERT INTO JobCapability VALUES (8, 'Delivery');
INSERT INTO JobCapability VALUES (9, 'Operations');
INSERT INTO JobCapability VALUES (10, 'Business Development and Marketing');
INSERT INTO JobCapability VALUES (11, 'Organisational Strategy and Planning');
INSERT INTO JobCapability VALUES (12, 'People');
INSERT INTO JobCapability VALUES (13, 'Commercial and Financial Marketing');
INSERT INTO JobCapability VALUES (14, 'Business Services Support');

INSERT INTO JobDiscipline VALUES (0, 'Engineering, Strategy & Planning');
INSERT INTO JobDiscipline VALUES (1, 'Engineering');
INSERT INTO JobDiscipline VALUES (2, 'Architecture');
INSERT INTO JobDiscipline VALUES (3, 'Testing & Quality Assurance');
INSERT INTO JobDiscipline VALUES (4, 'Product Specialist');
INSERT INTO JobDiscipline VALUES (5, 'Platform Strategy and Planning');
INSERT INTO JobDiscipline VALUES (6, 'Platform Engineering');
INSERT INTO JobDiscipline VALUES (7, 'Platform Architecture');
INSERT INTO JobDiscipline VALUES (8, 'Platform Specialists');
INSERT INTO JobDiscipline VALUES (9, 'Cloud Migration');
INSERT INTO JobDiscipline VALUES (10, 'Systems Support');
INSERT INTO JobDiscipline VALUES (11, 'Data Strategy and Planning');
INSERT INTO JobDiscipline VALUES (12, 'Data Engineering');
INSERT INTO JobDiscipline VALUES (13, 'Analysis & Data Architecture');

INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies) 
VALUES ('(CTO) Chief Technology Officer', 
		'Technology Lead', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Engineering'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Engineering, Strategy & Planning'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Leadership'),
		'Leadership' );
        
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) 
VALUES ('Innovation Lead', 
		'As an Innovation Lead (Consultant) in Kainos, you’ll be responsible will lead the team, working with the Innovation Lead in a dynamic and hands-on role which will involve managing and developing the team, implementing and shaping Kainos’ innovation strategy and effectively communicating the exciting work we undertake both internally and within the wider technology community.', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Engineering'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Engineering, Strategy & Planning'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Consultant'),
		'Intermediate', 
        'https://kainossoftwareltd.sharepoint.com/:b:/r/people/Job%20Specifications/Engineering/Job%20profile%20-%20Innovation%20Lead%20(Consultant).pdf?csf=1&web=1&e=FdbaKs');
        
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) 
VALUES ('Lead Software Engineer', 
		'As a Lead Software Engineer (Consultant) in Kainos, you’ll be responsible for leading teams and developing high quality solutions which delight our customers and impact the lives of users worldwide. It’s a fast-paced environment so it is important for you to make sound, reasoned decisions. You’ll do this whilst learning about new technologies and approaches, with talented colleagues that will help you to learn, develop and grow. You’ll manage, coach and develop a small number of staff, with a focus on managing employee performance and assisting in their career development. You’ll also provide direction and leadership for your team as you solve challenging problems together.  As the technical leader in the team, you will also interact with customers, share knowledge and mentor those around you.', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Engineering'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Engineering'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Consultant'),
		'Intermediate',
        'https://kainossoftwareltd.sharepoint.com/:b:/r/people/Job%20Specifications/Engineering/Job%20profile%20-%20Lead%20Software%20Engineer%20(Consultant).pdf?csf=1&web=1&e=UTzytf');
        
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) 
VALUES ('Senior Software Engineer', 
		'As a Senior Software Engineer (Senior Associate) in Kainos, you’ll be responsible for developing high quality solutions which delight our customers and impact the lives of users worldwide. It’s a fast-paced environment so it is important for you to make sound, reasoned decisions. You’ll do this whilst learning about new technologies and approaches, with talented colleagues that will help you to learn, develop and grow as you, in turn, mentor those around you.', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Engineering'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Engineering'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Senior Associate'),
		'Developing',
        'https://kainossoftwareltd.sharepoint.com/:b:/r/people/Job%20Specifications/Engineering/Job%20profile%20-%20Senior%20Software%20Engieneer%20(Senior%20Associate).pdf?csf=1&web=1&e=uUen7B');
        
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) 
VALUES ('Software Engineer', 
		'As a Software Engineer (Associate) in Kainos, you’ll be responsible for developing high quality solutions which delight our customers and impact the lives of users worldwide. You’ll do this whilst learning about new technologies and approaches, with talented colleagues that will help you to learn, develop and grow.', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Engineering'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Engineering'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Associate'),
		'Foundational',
        'https://kainossoftwareltd.sharepoint.com/:b:/r/people/Job%20Specifications/Engineering/Job%20profile%20-%20Software%20Engineer%20(Associate).pdf?csf=1&web=1&e=fwoW3x');
        
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) 
VALUES ('Software Engineer', 
		'As a Trainee Software Engineer with Kainos, you will work on projects where you can make a real difference to people’s lives – the lives of people you know. After taking part in our award-winning, seven-week Engineering Academy, you will then join one of our many project teams, to learn from our experienced developers, project managers and customer-facing staff. You’ll have great support and mentoring, balanced with the experience of being given real, meaningful work to do, to help you truly develop both technically and professionally.  ', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Engineering'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Engineering'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Trainee'),
		'Basic',
        'https://kainossoftwareltd.sharepoint.com/:b:/r/people/Job%20Specifications/Engineering/Job%20profile%20-%20Software%20Engineer%20(Trainee).pdf?csf=1&web=1&e=7grvgu');
        
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) 
VALUES ('Software Engineer', 
		'As an Apprentice Software Engineer with Kainos, you will work on projects where you can make a real difference to people’s lives – the lives of people you know. extensive training to set you off on the right foot, you will quickly work as a part of a team in developing solutions within our real projects, learning all about our development languages, projects and technologies. You will be fully supported by experienced colleagues in the team as well as an experienced mentor, who will provide training and mentoring throughout your studies. You’ll also get experience across a wide range of teams and projects, with built-in rotations to help you learn and work out which element of Software Engineering suits your interests and skills best.', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Engineering'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Engineering'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Apprentice'),
		'Beginner',
        'https://kainossoftwareltd.sharepoint.com/:b:/r/people/Job%20Specifications/Engineering/Job%20profile%20-%20Apprentice%20Software%20Engineer%20(Apprentice).pdf?csf=1&web=1&e=XJz4b3');
        
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) 
VALUES ('Platform Engineer', 
		'As Platform Engineer (Associate) in Kainos, you’ll be responsible for automating, building and supporting modern digital service platforms using public cloud technology. You’llbe continually learning aboutnewtechnologies, approaches and industry best practices all whilst being mentored and coached by talented colleagues who will help you learn, develop and grow.  Successful candidates will have a passion for technology and a thirst for learning.', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Platforms'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Platform Engineering'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Associate'),
		'Foundational',
        'https://kainossoftwareltd.sharepoint.com/:b:/r/people/Job%20Specifications/Platforms/Job%20profile%20-%20Platform%20Engineer%20(Associate).pdf?csf=1&web=1&e=4LnjEP');
        
INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) 
VALUES ('Data Engineer', 
		'As a Data Engineer (Associate) in Kainos you will work within a multi-skilled agile team to design and develop large-scale data processing software to meet user needs in demanding production environments.', 
		(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = 'Data'),
		(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = 'Data Engineering'),
		(SELECT JobBandID FROM JobBand WHERE JobBand = 'Associate'),
		'Foundational',
        'https://kainossoftwareltd.sharepoint.com/:b:/r/people/Job%20Specifications/Data/Job%20profile%20-%20Data%20Engineer%20(As).pdf?csf=1&web=1&e=gwmzOq');

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    'Working closely with the Innovation Lead to implement an innovation strategy and contribute to direction of innovation at Kainos.'
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    'Actively building a development plan for the team, managing them on a day-to-day basis and mentoring them.'
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    'Assume a leadership position in driving the approaches and tooling required for dynamic R&D projects.'
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    'Active engagement with the wider technology community, including conferences, meetups and events to continue to demonstrate the Innovation Team’s thought leadership in public forums.'
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    'Maintenance and introduction of required team artefacts that establish process improvements where required to maximize efficiency.'
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    "Collaborate with the Innovation Lead and Director of Innovation to shape the company's strategy for innovation and connect strategy with tactical implementation."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    "Taking responsibility for the Innovation Team’s internal and external communications strategy to share knowledge and demonstrate leadership both internally and in the public domain."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    "Project management of multiple agile-driven projects, from supporting a solution to ensuring objectives are met."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    "Coordinating with other parts of the business and customers."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	2,
    "Contributing towards the building of an internal team culture of sharing, collaboration and fostering the importance of non-technical qualities."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Expertise in designing, building, testing and maintaining modern software applications"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Technical leadership of teams building and testing modern, scalable, secure, performant applications in line with software development principles, practices and patterns e.g. XP, TDD"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Experience of technical ownership for a product/software project, including architecture, estimation, product planning and user story/requirement creation"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Expertise in software design and development across all layers of an application"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "We are passionate about developing people – a demonstrated ability in managing, coaching and developing junior members of your team and wider community. "
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Experience with the latest Continuous Integration and Continuous Delivery techniques"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Good communication skills, with the ability to communicate issues to technical and non-technical people."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Active participation in knowledge sharing activities, both within the team and at a wider capability level and externally where appropriate."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Experience of debugging and troubleshooting live applications"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Experience of multiple programming languages and data storage technologies"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	3,
    "Knowledge of public cloud platforms, such as AWS and Azure, including SaaS and PaaS offerings "
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Proficient in designing, building, testing and maintaining modern software applications"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Experience of applying development best practices and patterns in relation to security, scalability and performance"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Contributing to technical decisions and direction in a collaborative team environment, including architecture, estimation, product planning, user story/requirement creation."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Experience of design and development across multiple layers of an application"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Mentoring junior team members"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Mentoring junior team members"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Good communication skills, with the ability to communicate issues to technical and non-technical people."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Experience of Continuous Integration and Continuous Delivery techniques"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Experience of debugging and troubleshooting live applications"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Active participation in knowledge sharing activities, both within the team and with wider non-technical audiences"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Experience of multiple programming languages and data storage technologies"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Experience of balancing technical decisions with user needs and commercial constraints"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Knowledge of public cloud platforms, such as AWS and Azure, including SaaS and PaaS offerings"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	4,
    "Knowledge of public cloud platforms, such as AWS and Azure, including SaaS and PaaS offerings"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "Experience of building and testing modern software applications"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "Experience of applying common design principles and patterns"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "Experience of working in a collaborative team environment"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "You’re flexible and overcome obstacles to get the job done to achieve personal, team, and business goals."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "You actively look for better ways to do things using your imagination to find fresh solutions to complex problems."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "You are always constructive when giving or receiving feedback, being transparent and truthful when dealing with others."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "You treat others as you would like to be treated being encouraging, accepting and supportive to everyone you deal with."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "You share information, knowledge and experience, understanding the mutual benefits of team working."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "Exposure to modern version control and Continuous Delivery pipeline techniques"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "Experience of troubleshooting issues within development and test environments"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "Exposure to multiple programming languages and data storage technologies: SQL/NOSQL."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	5,
    "Good communication skills, with the ability to communicate issues to other technical people, and sometimes to non-technical people"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Contribute to developing high quality solutions which impact the lives of users worldwide."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "You’ll work as part of a team to solve problems and produce innovative software solutions."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Learn about new technologies and approaches, with talented colleagues who will help you learn, develop and grow."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Based in our Kainos office and often on our customer sites, you will work on a project teams to learn how to develop and unit test developing and unit testing straightforward or low complexity components, and then moving on to more complex elements as you increase your knowledge."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Work with other developers in working through designs and user stories and to produce real development solutions"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Will be fully supported by experienced colleagues in the team to follow designs,and then progress to assist in any other aspect of the project life-cycle under supervision"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Develop excellent technical, team-working and Agile project experience"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Completed or are currently studying a relevant third level IT qualification"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Familiar with some programming languages and implementation environments."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Some understanding of the software development lifecycle from your studies or relevant work experience, and the relevance of different tools at different stages of the development lifecycle"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Able to make effective decisions with the support of team members, within fast-moving delivery environment."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Have an open attitude to sharing knowledge and information."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Ideally have some experience of working in a collaborative team environment"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Good communication skills with the ability to communicate issues to other technical people and, sometimes, non-technical people"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Good problem solving and analytical skills."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "We all work in teams here in Kainos – a proven ability of strong team skills, including taking direction from others, is crucial."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Ability to carry out responsibilities in accordance with company policies, procedures and processes."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	6,
    "Ability to deliver tasks within a given timeframe."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	7,
    "Work on projects where you can make a real difference to people’s lives"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	7,
    "you will quickly work as a part of a team in developing solutions within our real project"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	7,
    "You will be fully supported by experienced colleagues in the team as well as an experienced mentor"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	7,
    " You’ll also get experience across a wide range of teams and projects"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	7,
    "You’ll have a genuine enthusiasm for anything “tech”"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	7,
    "You’ll be able to show us your teamworking skills"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	7,
    "you’ll be able to show us your skills for coming up with new ideas and ways of doing things"
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	8,
    "Working as part of a team - You’ll work alongside colleagues in engineering, testing, consulting, product management and security capabilities to build, test and deploy software of the highest quality."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	8,
    "Using technology for positive impact– You’ll ensure the latest technologies are employed appropriately to extract maximum user and business benefit."
);

INSERT INTO JobRoleResponsibilities (JobRoleID, JobRoleResponsibility) VALUES (
	8,
    "Putting people first - you’ll support your colleagues and foster a DevOps culture in all that you do."
);





SELECT * FROM JobRoleResponsibilities;
