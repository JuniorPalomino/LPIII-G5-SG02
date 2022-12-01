-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-12-2022 a las 21:02:58
-- Versión del servidor: 8.0.31
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sonoo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emp`
--

CREATE TABLE `emp` (
  `id` varchar(10) NOT NULL,
  `name` varchar(40) NOT NULL,
  `age` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `emp`
--

INSERT INTO `emp` (`id`, `name`, `age`) VALUES
('1', 'luis', '20'),
('2', 'junior', '21'),
('3', 'josue', '23'),
('4', 'antony', '20'),
('8', 'andrea', '18'),
('9', 'monica', '21'),
('10', 'sofia', '18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emp2`
--

CREATE TABLE `emp2` (
  `id` int NOT NULL,
  `name` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `emp2`
--

INSERT INTO `emp2` (`id`, `name`) VALUES
(101, 'Ratan');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emp400`
--

CREATE TABLE `emp400` (
  `id` varchar(10) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `salario` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `emp400`
--

INSERT INTO `emp400` (`id`, `nombre`, `salario`) VALUES
('1', 'luis', '1500'),
('2', 'miguel', '2500'),
('3', 'josue', '2000'),
('4', 'maria', '1000'),
('5', 'alejandra', '1500'),
('6', 'junior', '2000'),
('7', 'antony', '2000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
