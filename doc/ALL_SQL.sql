-- all database

-- 1 玩家帳號表
CREATE  TABLE `novel`.`user_account` (
  `id` VARCHAR(20) NOT NULL COMMENT 'UAYYYYMMDDhhmmSSXXXX',
  `name` VARCHAR(50) NOT NULL COMMENT '玩家名稱',
  `password` VARCHAR(50) NOT NULL COMMENT '密碼',
  `update_time` TIMESTAMP NOT NULL COMMENT '異動時間',
  PRIMARY KEY (`id`) )
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;

-- 2 儲存檔表
CREATE TABLE `save_data` (
	`id` VARCHAR(20) NOT NULL COMMENT 'SDYYYYMMDDhhmmSSXXXX',
	`user_account_id` INT NOT NULL COMMENT '外來鍵_玩家ID',
	`chapter` INT NOT NULL COMMENT '章節',
	`paragraph` INT NOT NULL COMMENT '段落',
	`description` VARCHAR(50) NULL COMMENT '描述',
	`game_parameter_id` VARCHAR(20) NOT NULL COMMENT '外來鍵_遊戲參數ID',
	`update_time` TIMESTAMP NOT NULL
)
COLLATE='utf8_general_ci'
;

-- 3 遊戲參數表
CREATE TABLE `game_parameter` (
	`id` VARCHAR(20) NOT NULL COMMENT 'GPYYYYMMDDhhmmSSXXXX',
	`save_data_id` VARCHAR(20) NOT NULL COMMENT '外來鍵_儲存檔ID',
	`health_point` INT NOT NULL COMMENT '體力',
	`sanity_point` INT NOT NULL COMMENT '精神',
	`charming_point` INT NOT NULL COMMENT '吸引力',
	`m_charming_like` INT NOT NULL COMMENT 'M好感度',
	`l_charming_like` INT NOT NULL COMMENT 'L好感度',
	`a_charming_like` INT NOT NULL COMMENT 'A好感度',
	`seed_point` INT NOT NULL COMMENT '後代',
	`king_point` INT NOT NULL COMMENT '國王',
	`update_time` TIMESTAMP NOT NULL
)
COLLATE='utf8_general_ci'
;

-- 4 章節開關表
CREATE TABLE `other_switch` (
	`id` VARCHAR(20) NOT NULL COMMENT 'OShhmmSS999XXXX',
	`save_data_id` INT NOT NULL COMMENT '外來鍵_儲存檔ID',
	`chapter` INT NOT NULL COMMENT '章節',
	`paragraph` INT NOT NULL COMMENT '段落',
	`switch_name` VARCHAR(30) NOT NULL COMMENT '開關名稱',
	`switch_status` INT NOT NULL COMMENT '開關狀態',
	`update_time` TIMESTAMP NOT NULL
)
COLLATE='utf8_general_ci'
;


-- 5 第一章
CREATE TABLE `chapter1` (
	`id` VARCHAR(20) NOT NULL COMMENT 'C1_999999000000',
	`paragraph` INT NOT NULL COMMENT '段落',
	`character_name` VARCHAR(30) NULL COMMENT '角色名稱',
	`text_content` INT NOT NULL COMMENT '故事文字內容',
	`update_time` TIMESTAMP NOT NULL
)
COLLATE='utf8_general_ci'
;

