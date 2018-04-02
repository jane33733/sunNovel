-- all database

-- 1 user
CREATE  TABLE `novel`.`user_account` (

  `id` INT NOT NULL ,

  `name` VARCHAR(45) NULL COMMENT '玩家名稱' ,

  PRIMARY KEY (`id`) )

DEFAULT CHARACTER SET = utf8

COLLATE = utf8_unicode_ci;