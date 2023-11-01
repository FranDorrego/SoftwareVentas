-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2023 a las 20:22:50
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `ID_Cliente` int(11) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Domicilio` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Numero_Identificacion` varchar(50) NOT NULL,
  `Es_Empleado` tinyint(1) NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT 0,
  `Clave` varchar(50) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`ID_Cliente`, `Apellido`, `Nombre`, `Domicilio`, `Telefono`, `Numero_Identificacion`, `Es_Empleado`, `Estado`, `Clave`) VALUES
(1, 'Ventas', 'Juan', 'Villa allende', '123456789', '428602258', 0, 1, '0'),
(2, 'Giles', 'NOMBRE CAMBIO', 'Buenos aires', '96325874', '32546897', 0, 0, NULL),
(3, 'Briant', 'Erica', 'Mendoza', '74185236', '78945632', 0, 1, '0'),
(4, 'Funes', 'Walter', 'Unquillo', '98746532', '95126348', 0, 1, '0'),
(5, 'Giles', 'Alfredo', 'Buenos aires', '96325874', '832546897', 1, 1, '654321'),
(6, 'Ventas', 'Juan', 'Villa allende', '123456789', '8428602258', 1, 0, '123456'),
(8, 'Briant', 'Erica', 'Mendoza', '74185236', '878945632', 1, 1, '415263'),
(9, 'Funes', 'Walter', 'Unquillo', '98746532', '895126348', 1, 1, '362514'),
(10, ' ', ' ', ' ', '123', '   ', 1, 0, '      '),
(11, 'fddfdfd', 'agusto', 'donato alvares 123456', '123', '         1 2 3 45 6 ', 1, 0, '      1 2 3 4 5 '),
(12, 'aaaa', 'aaaaaaaa', 'aaa', '123456', '123', 1, 0, '123456'),
(14, 'power', 'Pablo', 'villa allende', '3512456', '42860258', 1, 1, '123456'),
(15, 'allende', 'cliente 2', 'cordoba', '456789', '5869', 0, 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE `detalle_venta` (
  `ID_Detalle_Venta` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `ID_Venta` int(11) NOT NULL,
  `Precio_Venta` double NOT NULL COMMENT 'Es el precio unitario',
  `ID_Producto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`ID_Detalle_Venta`, `Cantidad`, `ID_Venta`, `Precio_Venta`, `ID_Producto`) VALUES
(53, 1, 15, 1200000, 22),
(54, 1, 15, 200000, 21),
(55, 1, 15, 800000, 20),
(56, 1, 16, 1200000, 22),
(57, 19, 16, 200000, 21),
(58, 26, 16, 800000, 20),
(59, 17, 16, 1200000, 17),
(60, 13, 17, 800000, 20),
(61, 2, 18, 200000, 16),
(62, 6, 19, 200000, 16),
(63, 7, 19, 1200000, 17),
(64, 7, 20, 200000, 16),
(65, 11, 21, 200000, 16),
(66, 8, 22, 1200000, 17),
(67, 1, 23, 1200000, 17),
(68, 1, 24, 200000, 21),
(69, 1, 26, 1200000, 22),
(70, 3, 27, 1200000, 17),
(71, 13, 28, 1200000, 17),
(72, 8, 29, 1200000, 17),
(73, 1, 30, 1200000, 17),
(74, 1, 31, 1200000, 17),
(75, 1, 32, 500000, 19),
(76, 15, 33, 1200000, 17),
(77, 1, 34, 1200000, 17),
(78, 2, 35, 2, 29);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimientos`
--

CREATE TABLE `movimientos` (
  `Fecha` timestamp NOT NULL DEFAULT current_timestamp(),
  `ID_Cliente` int(11) NOT NULL,
  `Detalle` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `ID_Producto` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Descripcion` varchar(300) NOT NULL,
  `Precio_Actual` double NOT NULL,
  `Stock` int(11) NOT NULL,
  `Estado` tinyint(4) NOT NULL,
  `Stock_Seguridad` int(11) DEFAULT NULL,
  `ID_Rubro` int(11) NOT NULL,
  `ID_Cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`ID_Producto`, `Nombre`, `Descripcion`, `Precio_Actual`, `Stock`, `Estado`, `Stock_Seguridad`, `ID_Rubro`, `ID_Cliente`) VALUES
(14, '--------------', 'Televisor 4K con pantalla curva', 500000, -10, 0, 12, 10, 3),
(15, 'Laptop Dell XPS', 'Portátil de 15 pulgadas con Intel Core i7', 800000, 30, 0, 8, 10, 2),
(16, 'Audífonos Bose QC35', 'Audífonos con cancelación de ruido', 200000, 132, 0, 15, 10, 9),
(17, 'Cámara Canon EOS R', 'Cámara mirrorless de alta resolución', 1200000, 61, 1, 5, 10, 9),
(18, 'Lavarropas LG 8kg', 'Lavarropas automático con capacidad de 8kg', 300000, 25, 0, 10, 10, 3),
(19, 'Televisor 4K con pantalla curva', 'Televisor 4K con pantalla curva', 500000, 49, 1, 12, 1, 9),
(20, 'Laptop Dell XPS', 'Portátil de 15 pulgadas con Intel Core i7', 800000, 30, 1, 8, 2, 2),
(21, 'Audífonos Bose QC35', 'Audífonos con cancelación de ruido', 200000, 99, 1, 15, 3, 4),
(22, 'Cámara Canon EOS R', 'Cámara mirrorless de alta resolución', 1200000, 18, 1, 5, 4, 1),
(23, 'Lavarropas LG 8kg', 'Lavarropas automático con capacidad de 8kg', 300000, 25, 0, 10, 6, 3),
(24, 'Televisor 4K con pantalla curva', 'Televisor 4K con pantalla curva', 500000, 50, 0, 12, 1, 9),
(25, 'Laptop Dell XPS', 'Portátil de 15 pulgadas con Intel Core i7', 800000, 30, 1, 8, 2, 2),
(26, 'Audífonos Bose QC35', 'Audífonos con cancelación de ruido', 200000, 100, 1, 15, 3, 4),
(27, 'Cámara Canon EOS R', 'Cámara mirrorless de alta resolución', 1200000, 20, 1, 5, 4, 1),
(28, 'Lavarropas LG 8kg', 'Lavarropas automático con capacidad de 8kg', 300000, 25, 0, 10, 6, 3),
(29, 'gggggggggggg', 'ggggg', 2, 0, 0, 2, 2, 9),
(30, 'dsdsds', 'dsdsdsd', 123, 123, 0, 123, 1, 9),
(31, 'dfdfdf', 'dfdfdfdf', 123, 123, 0, 123, 2, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rubro`
--

CREATE TABLE `rubro` (
  `ID_Rubro` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Descripcion` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rubro`
--

INSERT INTO `rubro` (`ID_Rubro`, `Nombre`, `Descripcion`) VALUES
(1, 'Televisores', 'Televisores de diferentes marcas y tamaños'),
(2, 'Computadoras', 'Portátiles y de escritorio con diferentes especificaciones'),
(3, 'Audio', 'Audífonos, bocinas y sistemas de sonido'),
(4, 'Cámaras', 'Cámaras digitales, DSLR y accesorios'),
(5, 'Componentes Electrónicos', 'Tarjetas madre, procesadores, memoria RAM y más'),
(6, 'Lavarropas', 'Lavarropas automáticos y semi-automáticos de diversas marcas'),
(7, 'Tablets', 'Dispositivos portátiles para trabajo y entretenimiento'),
(8, 'Smartwatches', 'Relojes inteligentes con diversas funcionalidades'),
(9, 'Consolas de Videojuegos', 'Consolas de diversas generaciones y marcas'),
(10, 'Accesorios de Computadora', 'Teclados, ratones, monitores y otros accesorios');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `ID_Venta` int(11) NOT NULL,
  `ID_Cliente` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `ID_Empleado` int(11) NOT NULL,
  `Fecha_Server` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`ID_Venta`, `ID_Cliente`, `Fecha`, `ID_Empleado`, `Fecha_Server`) VALUES
(15, 1, '2023-10-26 00:00:00', 9, '2023-10-26 17:36:31'),
(16, 1, '2023-10-26 00:00:00', 9, '2023-10-26 17:38:27'),
(17, 1, '2023-10-26 00:00:00', 9, '2023-10-26 17:50:03'),
(18, 1, '2023-10-26 00:00:00', 9, '2023-10-26 18:36:41'),
(19, 1, '2023-10-26 00:00:00', 9, '2023-10-26 18:42:09'),
(20, 1, '2023-10-26 00:00:00', 9, '2023-10-26 18:42:30'),
(21, 1, '2023-10-26 00:00:00', 9, '2023-10-26 18:49:21'),
(22, 1, '2023-10-26 00:00:00', 9, '2023-10-26 18:50:40'),
(23, 8, '2023-10-26 00:00:00', 9, '2023-10-27 00:32:24'),
(24, 8, '2023-10-26 00:00:00', 9, '2023-10-27 00:32:29'),
(25, 1, '2023-10-27 00:00:00', 9, '2023-10-27 19:07:16'),
(26, 1, '2023-10-27 00:00:00', 9, '2023-10-27 19:14:52'),
(27, 1, '2023-10-31 00:00:00', 9, '2023-10-31 19:09:34'),
(28, 1, '2023-10-31 00:00:00', 9, '2023-10-31 19:21:18'),
(29, 1, '2023-10-31 00:00:00', 9, '2023-10-31 19:22:35'),
(30, 1, '2023-10-31 00:00:00', 9, '2023-10-31 19:31:08'),
(31, 1, '2023-10-31 00:00:00', 9, '2023-10-31 19:31:50'),
(32, 1, '2023-10-31 16:32:57', 9, '2023-10-31 19:32:57'),
(33, 1, '2023-10-31 16:39:20', 9, '2023-10-31 19:39:20'),
(34, 1, '2023-11-01 14:54:45', 9, '2023-11-01 17:54:45'),
(35, 1, '2023-11-01 15:29:49', 9, '2023-11-01 18:29:49');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ID_Cliente`),
  ADD UNIQUE KEY `Numero_Identificacion` (`Numero_Identificacion`);

--
-- Indices de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD PRIMARY KEY (`ID_Detalle_Venta`),
  ADD KEY `ID_Producto` (`ID_Producto`),
  ADD KEY `ID_Venta` (`ID_Venta`);

--
-- Indices de la tabla `movimientos`
--
ALTER TABLE `movimientos`
  ADD KEY `ID_Cliente` (`ID_Cliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`ID_Producto`),
  ADD KEY `ID_Rubro` (`ID_Rubro`),
  ADD KEY `ID_Cliente` (`ID_Cliente`);

--
-- Indices de la tabla `rubro`
--
ALTER TABLE `rubro`
  ADD PRIMARY KEY (`ID_Rubro`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`ID_Venta`),
  ADD KEY `ID_Cliente` (`ID_Cliente`),
  ADD KEY `ID_Empleado` (`ID_Empleado`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `ID_Cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  MODIFY `ID_Detalle_Venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `ID_Producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `rubro`
--
ALTER TABLE `rubro`
  MODIFY `ID_Rubro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `ID_Venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD CONSTRAINT `detalle_venta_ibfk_1` FOREIGN KEY (`ID_Producto`) REFERENCES `producto` (`ID_Producto`),
  ADD CONSTRAINT `detalle_venta_ibfk_2` FOREIGN KEY (`ID_Venta`) REFERENCES `venta` (`ID_Venta`);

--
-- Filtros para la tabla `movimientos`
--
ALTER TABLE `movimientos`
  ADD CONSTRAINT `movimientos_ibfk_1` FOREIGN KEY (`ID_Cliente`) REFERENCES `cliente` (`ID_Cliente`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`ID_Rubro`) REFERENCES `rubro` (`ID_Rubro`),
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`ID_Cliente`) REFERENCES `cliente` (`ID_Cliente`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`ID_Cliente`) REFERENCES `cliente` (`ID_Cliente`),
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`ID_Empleado`) REFERENCES `cliente` (`ID_Cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
