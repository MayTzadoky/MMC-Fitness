/****** Script for SelectTopNRows command from SSMS  ******/
/*SELECT TOP (1000) [userId]
      ,[firstName]
      ,[lastName]
      ,[phoneNumber]
      ,[email]
  FROM [MMC].[dbo].[user]*/


  INSERT INTO [MMC].[dbo].[user](userId, firstName, lastName, phoneNumber, email)
  VALUES ('1', 'may', 'ovadia', '0544422859', 'may@gmail.com')