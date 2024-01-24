import { newRenderer } from "./renderer.js"
import { Rectangle} from "./shapes/rectangle.js";
import { Shape} from "./shapes/shape.js";
import { square} from "./shapes/square.js";
import { circle} from "./shapes/circle.js";

const circle1: Shape = circle(2)
const rectangle: Shape = Rectangle(2, 3)
const square1: Shape = square(2)
const renderer = newRenderer(rectangle)
const renderer1 = newRenderer(circle1)
const renderer2 = newRenderer(square1)
renderer.draw();
renderer1.draw();
renderer2.draw();