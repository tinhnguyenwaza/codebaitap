
USE [TABLE_EXERCISE_1]

GO

--- CREATE NONCLUSERD INDEX
CREATE NONCLUSTERED INDEX [GIAMUA_INDEX] ON [dbo].[VATTU]
(
	[GIAMUA] ASC,
	[SLTON] ASC
)
GO

--	
CREATE NONCLUSTERED  INDEX [NGAY_INDEX] ON [dbo].[HOADON]
(
	[NGAY]
)
GO
