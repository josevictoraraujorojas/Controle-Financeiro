create database `controle_financeiro`;

use controle_financeiro;

CREATE TABLE `usuario` (
                           `id` INT NOT NULL AUTO_INCREMENT,
                           `login` VARCHAR(100) NOT NULL unique,
                           `senha` VARCHAR(100) NOT NULL,
                           `saldo` FLOAT(10) NOT NULL,
                           `limite_despesa_fixa` FLOAT(10) NOT NULL,
                           `limite_despesa_variavel` FLOAT(10) NOT NULL,
                           `limite_metas` FLOAT(10) NOT NULL,
                           PRIMARY KEY (`id`)
);

CREATE TABLE `metas` (
                         `id_metas` INT NOT NULL AUTO_INCREMENT,
                         `id` INT NOT NULL,
                         `categoria` VARCHAR(100) NOT NULL,
                         `data_inicial` VARCHAR(10) NOT NULL,
                         `data_final` VARCHAR(10) NOT NULL,
                         `descricao` VARCHAR(100) NOT NULL,
                         `valor_total` FLOAT(10) NOT NULL,
                         `valor_arrecadado` FLOAT(10) NOT NULL,
                         `recorrencia` VARCHAR(100) NOT NULL,
                         PRIMARY KEY (`id_metas`),
                         FOREIGN KEY (`id`) REFERENCES `usuario`(`id`)
);

CREATE TABLE `despesa_fixa` (
                                `id_despesa_fixa` INT NOT NULL AUTO_INCREMENT,
                                `id` INT NOT NULL,
                                `valor_mensal` FLOAT(10) NOT NULL,
                                `categoria` VARCHAR(100) NOT NULL,
                                `data_emissao` VARCHAR(10) NOT NULL,
                                `data_vencimento` VARCHAR(10) NOT NULL,
                                `descricao` VARCHAR(100) NOT NULL,
                                `recorrencia` VARCHAR(100) NOT NULL,
                                PRIMARY KEY (`id_despesa_fixa`),
                                FOREIGN KEY (`id`) REFERENCES `usuario`(`id`)
);

CREATE TABLE `despesa_variavel` (
     `id_despesa_variavel` INT NOT NULL AUTO_INCREMENT,
     `id` INT NOT NULL,
     `valor` FLOAT(10) NOT NULL,
     `qtd_parcelas` INT NOT NULL,
      `parcelas_pagas` INT NOT NULL,
    `categoria` VARCHAR(100) NOT NULL,
                                    `data_emissao` DATE NOT NULL,
                                    `data_vencimento` DATE NOT NULL,
                                    `descricao` VARCHAR(100) NOT NULL,
                                    `recorrencia` VARCHAR(100) NOT NULL,
                                    PRIMARY KEY (`id_despesa_variavel`),
                                    FOREIGN KEY (`id`) REFERENCES `usuario`(`id`)
);