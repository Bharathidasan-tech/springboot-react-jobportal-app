CREATE TABLE job_details
(
   id             INT NOT NULL AUTO_INCREMENT,
   company_name    VARCHAR(255),
   company_url     VARCHAR(255),
   contact_email   VARCHAR(255),
   job_role        VARCHAR(255), 
   job_location    VARCHAR(255),
   job_description VARCHAR(1000),
   post_date       VARCHAR(255),
   close_date      VARCHAR(255),  
   PRIMARY KEY (id)
);

 CREATE TABLE jobseeker_details
 ( 
 id              INT NOT NULL AUTO_INCREMENT,
 jobseeker_name  VARCHAR(255 CHAR),
 email           VARCHAR(255),
 phone           LONG,
 country_name     VARCHAR(255), 
 cv_url           VARCHAR(300),
 cover_letter     VARCHAR(1000),
 github_url       VARCHAR(300),
 linkeIn_url     VARCHAR(300),
 PRIMARY KEY (id)
 ); 
 
CREATE TABLE job_x_seeker
( 
job_id INT,
jobseeker_id INT,
PRIMARY KEY (job_id,jobseeker_id),
FOREIGN KEY ( job_id) REFERENCES job_details (id),
FOREIGN KEY ( jobseeker_id) REFERENCES jobseeker_details (id)
);