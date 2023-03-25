import tkinter as tk
import parser

ventana = tk.Tk()
ventana.title("CALCULADORA")
#ventana.geometry("200x220")
resultado = tk.Entry(ventana,width=35)
resultado.grid(row=1, columnspan=4)

i = 0


def num(n):
    global i
    resultado.insert(i, n)
    i += 1

def operador(operator):
    global i
    operator_length = len(operator)
    resultado.insert(i, operator)
    i+=operator_length

def calcular():
    resultadoT = resultado.get()
    try:
        operacionMat = parser.expr(resultadoT).compile()
        result = eval(operacionMat)
        borrar_todo()
        resultado.insert(0, result)
    except Exception:
        borrar_todo()
        resultado.insert(0, 'Error')

def borrar_todo():
    resultado.delete(0, tk.END)


def borrar():
    rta = resultado.get()
    if len(rta):
        rtn = rta[:-1]
        borrar_todo()
        resultado.insert(0, rtn)
    else:
        borrar_todo()
        resultado.insert(0, 'Error')



boton1 = tk.Button(ventana,width=5,height=2, text="1", command=lambda: num(1)).grid(row=3, column=0)
boton2 = tk.Button(ventana,width=5,height=2, text="2", command=lambda: num(2)).grid(row=3, column=1)
boton3 = tk.Button(ventana,width=5,height=2, text="3", command=lambda: num(3)).grid(row=3, column=2)
boton4 = tk.Button(ventana,width=5,height=2, text="4", command=lambda: num(4)).grid(row=4, column=0)
boton5 = tk.Button(ventana,width=5,height=2, text="5", command=lambda: num(5)).grid(row=4, column=1)
boton6 = tk.Button(ventana,width=5,height=2, text="6", command=lambda: num(6)).grid(row=4, column=2)
boton7 = tk.Button(ventana,width=5,height=2, text="7", command=lambda: num(7)).grid(row=5, column=0)
boton8 = tk.Button(ventana,width=5,height=2, text="8", command=lambda: num(8)).grid(row=5, column=1)
boton9 = tk.Button(ventana,width=5,height=2, text="9", command=lambda: num(9)).grid(row=5, column=2)
boton0 = tk.Button(ventana,width=5,height=2, text="0", command=lambda: num(0)).grid(row=6, column=1)

boton0 = tk.Button(ventana,width=5,height=2, text=".", command=lambda: num(".")).grid(row=6, column=0)
botonC = tk.Button(ventana,width=5,height=2, text="C", command=lambda: borrar_todo()).grid(row=2, column=0)
botonDel = tk.Button(ventana,width=5,height=2, text="<-", command=lambda: borrar()).grid(row=2, column=1)

botonDiv = tk.Button(ventana,width=5,height=2, text="%", command=lambda: operador("%")).grid(row=2, column=2)
botonMas = tk.Button(ventana,width=5,height=2, text="+", command=lambda: operador("+")).grid(row=2, column=3)
botonMen = tk.Button(ventana,width=5,height=2, text="-", command=lambda: operador("-")).grid(row=3, column=3)
botonMul = tk.Button(ventana,width=5,height=2, text="*", command=lambda: operador("*")).grid(row=4, column=3)
botonDiv = tk.Button(ventana,width=5,height=2, text="/", command=lambda: operador("/")).grid(row=5, column=3)

botonEqu = tk.Button(ventana,width=12,height=2, text="=", command=lambda: calcular()).grid(row=6, column=2, columnspan=2)

ventana.mainloop()