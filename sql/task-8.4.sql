CREATE TABLE ISSUESLIST (
    ID SERIAL PRIMARY KEY,
    NAME VARCHAR(150)
);
CREATE TABLE ISSUES (
    ID SERIAL PRIMARY KEY,
    ISSUESLIST_ID BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY (ISSUESLIST_ID)
        REFERENCES ISSUESLIST (ID),
    SUMMARY VARCHAR(1024),
    DESCRIPTION VARCHAR(1024),
    USER_ID_ASSIGNEDTO BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY (USER_ID_ASSIGNEDTO)
        REFERENCES USERS (ID)
);
INSERT INTO ISSUESLIST (NAME)
VALUES ("ToDo");
INSERT INTO ISSUESLIST (NAME)
VALUES ("In progress");
INSERT INTO ISSUESLIST (NAME)
VALUES ("Done");
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Agriculture", "sustainable agriculture", 2);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Agriculture", "food security", 2);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Atomic energy", "nuclear weapons", 1);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Atomic energy", "nuclear waste", 1);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Children", "child poverty", 4);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Children", "child labour", 4);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Children", "child abuse", 4);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Children", "child mortality", 3);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Children", "global education", 3);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Decolonization", "exploitation", 2);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Demining", "land mines", 1);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Disarmament", "weapons of mass destruction", 4);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Disarmament", " chemical and biological weapons", 1);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Governance", " rule of law", 2);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Water (s.a. Ocean trash)", " water pollution", 2);
COMMIT;
SELECT * FROM ISSUESLIST;
SELECT * FROM ISSUES;