CREATE TABLE `tb_user` (
	`user_id` INT(11) NOT NULL AUTO_INCREMENT,
	`user_name` VARCHAR(50) NOT NULL COLLATE 'armscii8_bin',
	`nm_user` VARCHAR(20) NOT NULL COLLATE 'armscii8_bin',
	`user_password` VARCHAR(100) NOT NULL COLLATE 'armscii8_bin',
	PRIMARY KEY (`user_id`) USING BTREE
)
COLLATE='armscii8_bin'
ENGINE=InnoDB
AUTO_INCREMENT=6
;