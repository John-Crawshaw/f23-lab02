import { Shape} from "./shape.js";
function Rectangle(width: number, height: number): Shape {
    return {
        computeArea: function (): number {
            return width * height
        }
    }
}

export { Rectangle}
