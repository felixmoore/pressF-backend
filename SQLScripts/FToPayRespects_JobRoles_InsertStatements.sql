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
  
        
SELECT JobRoleID, JobTitle, JobSpecification, jc.JobCapability, jd.JobDiscipline, jb.JobBand, JobCompetencies, JobProfileLink, RecordCreated FROM JobRoles 
JOIN JobBand jb ON JobRoles.JobBand = jb.JobBandID 
JOIN JobDiscipline jd ON JobRoles.JobDiscipline = jd.JobDisciplineID 
JOIN JobCapability jc ON JobRoles.JobCapability = jc.JobCapabilityID;

UPDATE JobRoles SET JobCompetencies = 'Leadership' WHERE JobRoleID = 1;
UPDATE JobRoles SET JobCompetencies = 'Intermediate- Understands personal preferences, bias and differences. Champions Kainos offerings. Can set goals and manage independently. Escalating descisions only when appropriate. Consistently identifies and develops self and others. Demonstrates professional and organisational values. Supports and empowers through mentoring. Role model of continuous learning and self development. Builds strong network of collabortative relationships. Encourages involvement from others. Develops effective systems of time and workload management. Delegates authority to match responsibilities. Sets example of leadership. Seeks opinions and experiences from others. Balances team need with organisational needs. Identifies new opportunities. Recognises the impact of BU on the profitability of Kainos. Uses communication to show shared sense of purpose. Influencial and effective member of team. Assesses customers needs accurately.' WHERE JobRoleID = 2;
UPDATE JobRoles SET JobCompetencies = 'Intermediate- Understands personal preferences, bias and differences. Champions Kainos offerings. Can set goals and manage independently. Escalating descisions only when appropriate. Consistently identifies and develops self and others. Demonstrates professional and organisational values. Supports and empowers through mentoring. Role model of continuous learning and self development. Builds strong network of collabortative relationships. Encourages involvement from others. Develops effective systems of time and workload management. Delegates authority to match responsibilities. Sets example of leadership. Seeks opinions and experiences from others. Balances team need with organisational needs. Identifies new opportunities. Recognises the impact of BU on the profitability of Kainos. Uses communication to show shared sense of purpose. Influencial and effective member of team. Assesses customers needs accurately.' WHERE JobRoleID = 3;
UPDATE JobRoles SET JobCompetencies = 'Developing- Understands and articulates own learning and development needs. Seeks and responds positively to feedback. Looks for opportunities to take on new challenges. Recognises inappropriate behaviours and challenges constructively. Proactively supports development of other team members. Encourages both formal and informal learning opportunities. Effectively builds wider networks across projects, capabilities and BUs. Encourages collaborative team working. Open to giving and receiving honest feedback. Strong ability to multitask and priorities deadlines. Demonstrate individual responsibility for achieving objectives and able to articulate successs and failures. Consistently prepared for meetings. Processes and distils a variety of information to understand a problem fully. Supports peers and team members in understanding wider Kainos objectives. Recognises and reflects on how personal activities may have a wider impact. Provide a protective environment in which colleagues can escalate any issues. Demonstrates a clear understanding of how the business makes profit. Manages and meetsthe expectations of customers without compromising budgets. Understands the organisational structure of Kainos. Recognises and respect that communication is a two-way process. Persuades and influences with sound rationale argument. Authentic in stakeholder relationships.' WHERE JobRoleID = 4;

UPDATE JobRoles SET JobCompetencies = 'Foundational: Personal Performance - Seeks out new challenges and opportunities, recognises the need for SMART goals, encourages positive behaviour in others.
Working with Others - Actively take opportunities to learn from a diverse range of people, creative in finding ways to learn, consistently collaborates within teams, actively participates.
Setting Direction, Development and Accountability - Prioritise and communicate effectively, identifies commitments, establishes effective meetings through setting an agenda, makes suggestions for improvements to personal work and processes.
Supporting and Delivering the Strategy - Articulates individual contribution to the wider Kainos objectives, clearly defines how individual personal performance can have an impact on the business, respects differences and promotes inclusion.
Commerciality and Risk - Comprehends the need for the business to generate additional income and respects that costs need to be managed, considers and suggests ideas for improvements.
Communicating and Influence - Involved at meetings, asking questions, remaining communicative, demonstrates influencing skills, demonstrates how to participate in stakeholder management.' WHERE JobRoleID = 5;

UPDATE JobRoles SET JobCompetencies = 'Basic:
Personal Performance - Understands others\' strengths and areas for development, able to identify own goals, identifies learning gaps and seeks out opportunities to improve skills, demonstrates positive behaviours.
Working with Others - Shares learning with the team, maintains consistent performance, builds strong working relationships, aware of the consequences of behaviour.
Setting Direction, Development and Accountability - Plans time effectively, takes ownership of all responsibilities, effectively manages diary, breaks down issues.
Supporting and Delivering the Strategy - Recognises how to contribute to the wider organisational objectives and strategic principles, pays attention to organisational information, awareness of cultural differences.
Commerciality and Risk - Understands how the business generates income, reviews current practices and constructive in implementing changes to own work, consistently cooperates with business processes.
Communicating and Influence - Communicates own views in a clear and constructive manner, observes team/colleagues influencing internally and externally, understands who our customers are and what problems the team is trying to solve.' WHERE JobRoleID = 6;

UPDATE JobRoles SET JobCompetencies = 'Beginner:
Personal Performance - Understands own strengths and areas for development, works with People Manager to set and achieve goals, flexible and willing to learn on the job, understands the company values and principles.
Working with Others - Understands how to respond constructively to developmental feedback, displays high levels of enthusiasm, recognises the need to build internal networks, respects others by attending meetings on time.
Setting Direction, Development and Accountability - Understands role, tasks and deadlines, accepts personal responsibility for quality and timelines of work set, works to manage diary, commitments, actively supports new initiatives.
Supporting and Delivering the Strategy - Understands the Kainos Vision, Strategy and Principles, understands the organisation structure, possesses general knowledge of local cultural differences, familiar with Kainos diversity & inclusion policy.
Commerciality and Risk - Understands the markets and sectors in which Kainos operates, willing to learn, cooperates with business processes.
Communicating and Influence - Acts in a respectful manner, recognises influencing as a key skill, acts in accordance with the Kainos values.' WHERE JobRoleID = 7;

UPDATE JobRoles SET JobCompetencies = 'Foundational: Personal Performance - Seeks out new challenges and opportunities, recognises the need for SMART goals, encourages positive behaviour in others.
Working with Others - Actively take opportunities to learn from a diverse range of people, creative in finding ways to learn, consistently collaborates within teams, actively participates.
Setting Direction, Development and Accountability - Prioritise and communicate effectively, identifies commitments, establishes effective meetings through setting an agenda, makes suggestions for improvements to personal work and processes.
Supporting and Delivering the Strategy - Articulates individual contribution to the wider Kainos objectives, clearly defines how individual personal performance can have an impact on the business, respects differences and promotes inclusion.
Commerciality and Risk - Comprehends the need for the business to generate additional income and respects that costs need to be managed, considers and suggests ideas for improvements.
Communicating and Influence - Involved at meetings, asking questions, remaining communicative, demonstrates influencing skills, demonstrates how to participate in stakeholder management.' WHERE JobRoleID = 8;

UPDATE JobRoles SET JobCompetencies = 'Foundational: Personal Performance - Seeks out new challenges and opportunities, recognises the need for SMART goals, encourages positive behaviour in others.
Working with Others - Actively take opportunities to learn from a diverse range of people, creative in finding ways to learn, consistently collaborates within teams, actively participates.
Setting Direction, Development and Accountability - Prioritise and communicate effectively, identifies commitments, establishes effective meetings through setting an agenda, makes suggestions for improvements to personal work and processes.
Supporting and Delivering the Strategy - Articulates individual contribution to the wider Kainos objectives, clearly defines how individual personal performance can have an impact on the business, respects differences and promotes inclusion.
Commerciality and Risk - Comprehends the need for the business to generate additional income and respects that costs need to be managed, considers and suggests ideas for improvements.
Communicating and Influence - Involved at meetings, asking questions, remaining communicative, demonstrates influencing skills, demonstrates how to participate in stakeholder management.' WHERE JobRoleID = 9;
