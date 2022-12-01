-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-12-2022 a las 22:34:41
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `lab12_ejercicio_2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agenda`
--

CREATE TABLE `agenda` (
  `Id` int(11) NOT NULL,
  `Fname` varchar(200) NOT NULL,
  `Lname` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Phone` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `agenda`
--

INSERT INTO `agenda` (`Id`, `Fname`, `Lname`, `Email`, `Phone`) VALUES
(1, 'Junior', 'Palomino', 'junior@gmail.com', 915200017),
(2, 'Josue', 'Laurente', 'Josue@gmail.com', 920445789),
(3, 'Anthony ', 'Rivera', 'Anthony@gmail.com', 999666333),
(4, 'Pepe', 'Juares', 'Pepe@gmail.com', 908567321),
(5, 'Kevin', 'Inofuente', 'Kevin@gmail.com', 990567123),
(6, 'Carlos', 'Avila', 'Carlos@gmail.com', 976543120),
(7, 'Marcelo', 'Ramos', 'Marc@gmail.com', 952340018),
(8, 'Mario', 'Mamani', 'Mario@gmail.com', 977123587),
(9, 'Javier', 'Nuñez', 'Javier@gmail.com', 99211511),
(10, 'Juana', 'Valdez', 'juana@gmail.com', 987654321),
(11, 'Lucas', 'Rivera', 'lucas@gmail.com', 955433277);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agenda`
--
ALTER TABLE `agenda`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `agenda`
--
ALTER TABLE `agenda`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
