-- all database

-- 1 user
CREATE  TABLE `novel`.`user_account` (
  `id` INT NOT NULL ,
  `name` VARCHAR(45) NULL COMMENT '玩家名稱' ,
  PRIMARY KEY (`id`) )
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


CREATE TABLE `save_point` (
	`id` INT NOT NULL,
	`user_account_id` INT NOT NULL,
	`chapter_page` VARCHAR(10) NOT NULL,
	`description` VARCHAR(50) NULL,
	`status_id` INT NOT NULL,
	`update_time` TIMESTAMP NOT NULL
)
COLLATE='utf8_general_ci'
;
