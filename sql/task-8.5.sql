SELECT I.SUMMARY, IL.NAME
FROM ISSUES I
JOIN ISSUESLIST IL ON IL.ID = I.ISSUESLIST_ID;

SELECT U.FIRSTNAME, U.LASTNAME, I.ISSUESLIST_ID
FROM USERS U
JOIN ISSUES I ON U.ID = I.USER_ID_ASSIGNEDTO;

SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS ISSUESLIST_ID
FROM USERS U
JOIN ISSUES I ON U.ID = I.USER_ID_ASSIGNEDTO
GROUP BY I.USER_ID_ASSIGNEDTO;