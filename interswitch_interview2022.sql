--
-- Creating Database `interview`
--
CREATE DATABASE interview;

--
-- Creating Institution Table
--
CREATE TABLE institution (
    institution_id bigint NOT NULL IDENTITY (1,1)  PRIMARY KEY, 
    institution_code varchar(255)NOT NULL,
    institution_name varchar(255),
    date_created DATETIME
);
--
-- Creating Bank Branch Table
-- 
--
CREATE TABLE bank_branch (
    branch_id bigint NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    branch_code varchar(255) NOT NULL,
    branch_name varchar(255),
    date_created DATETIME,
    institution_id bigint FOREIGN KEY REFERENCES institution(institution_id)
);
--
-- Creating Users Table
--
CREATE TABLE users (
    user_id bigint NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    username varchar DEFAULT user,
    password varchar(255),
    last_name varchar(255),
    first_name varchar(255),
    email_address varchar(255),
    date_created DATETIME,
    institution_id bigint FOREIGN KEY REFERENCES institution(institution_id),
    branch_id bigint FOREIGN KEY REFERENCES bank_branch(branch_id)
);
--
-- Creating Roles Table 
--

CREATE TABLE user_roles (
    role_id bigint NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    role_name varchar (255),
    date_created DATETIME,
    role_code varchar (255),
    role_description varchar(255)
);

--
-- Creating Users Roles Table that will have information from
-- Users and Roles
-- The Foreign keys user_id and role_id
--
CREATE TABLE users_assigned_role (
    users_assigned_role_id bigint NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    user_id bigint FOREIGN KEY REFERENCES users(user_id),
    date_created DATETIME,
    role_id bigint FOREIGN KEY REFERENCES user_roles(role_id)
);
------------------------------------------------------------------------------------------------------------
                             --           Leave Management Tables
------------------------------------------------------------------------------------------------------------
--Creating Leave Management Table
CREATE TABLE leave_management (
    leave_request_id bigint NOT NULL IDENTITY (1,1) PRIMARY KEY,
    Leave_start_date DATETIME,
    leave_end_date DATETIME,
    leave_status BOOLEAN,
    request_date DATETIME,
    approver_date DATETIME, 
    user_id bigint FOREIGN KEY REFERENCES users(user_id),
    leave_approver bigint FOREIGN KEY REFERENCES users(user_id)
);

--Creating Employee Department Table
CREATE TABLE emp_dept (
    emp_dept_id bigint NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    emp_dept_name varchar (255),
    date_created DATETIME
);


Changing the Datatype of column username from varchar(1) to varchar(100)
ALTER TABLE users ALTER COLUMN username varchar(100);

For the First time, user credentials have to be inserted manually
INSERT INTO emp_dept (emp_dept_name, date_created) VALUES ('IT', getdate());

INSERT INTO institution_id (institution_code, institution_name, date_created) VALUES ('INT', 'Interswitch', getdate());

INSERT INTO bank_branch (branch_id, branch_code, branch_name, date_created, institution_id) VALUES ('MBL', 'Head Office', getdate(), '1');

INSERT INTO users (user_id, username, password, last_name, first_name, email_address, date_created, institution_id, branch_id, emp_dept_id) VALUES ('interview', 'interview', 'Hergty', 'Tim', 'wasiketim@gmail.com', getdate(), '1', '1', '1');

INSERT INTO user_roles (role_id, role_name, date_created, role_code, role_description) VALUES ('Administrator', getdate(), 'admin', 'Super Admin, 'Can Create User, Update and Delete'), (Employee', getdate(), 'admin', 'user, 'Can Create Requests, and View Requests');

