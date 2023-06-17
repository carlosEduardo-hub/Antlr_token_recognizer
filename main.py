from tkinter import *
from antlr4 import *
from gen.GrammarLexer import GrammarLexer
from gen.GrammarParser import GrammarParser


def recognize():
    janela2 = nova_janela()
    dados = ler_arquivo()
    lexer = GrammarLexer(dados)
    pos_row, pos_column = 0, 0  # Posição dos labels
    for tok in lexer.getAllTokens():
        novo_label(tok.text, tok.type, pos_row, pos_column, janela2)
        print(tok.text, tok.type)
        pos_column += 1
        if pos_column >= 10:
            pos_column = 0
            pos_row += 2
    lexer.reset()
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.inicio()
    print(tree.toStringTree())
    entry_label_1.delete(0.0, END)


def ler_arquivo():
    conteudo = entry_label_1.get(1.0, "end-1c")
    dados = FileStream(conteudo, encoding='utf-8')
    label_1_re['text'] = dados
    return dados


def novo_label(texto, tipo, pos_row, pos_column, interface):
    label = Label(interface, text=str(texto) + '  ' + str(tipo), font='Arial 12 bold', anchor='center',
                  bg='white', fg='black')
    label.grid(row=pos_row, column=pos_column)


def nova_janela():
    janela2 = Tk()
    janela2.title("Reconhecimento")
    janela2.geometry('1200x500')
    janela2.config(bg='white')

    return janela2


if __name__ == '__main__':
    janela = Tk()
    janela.title('Reconhecedor de tokens AntLR')
    janela.geometry('1200x600')
    janela.config(bg='black')

    label_1 = Label(janela, width=80, height=2,
                    text='Digite o nome do arquivo no formato .txt ("nome_do_arquivo".txt):',
                    font='Arial 15 bold', anchor='center', bg='black', fg='white')
    label_1.pack()

    label_2 = Label(janela, width=80, height=2, text='OBS: O arquivo deve estar localizado na pasta do projeto.',
                    font='Arial 12 bold', anchor='center', bg='black', fg='white')
    label_2.pack()
    entry_label_1 = Text(janela, height=1, width=30, font='Arial 12')
    entry_label_1.pack(pady=10)

    botao_1 = Button(janela, text='Realizar o reconhecimento do conteúdo deste arquivo',
                     relief='raised', bg='white', font='Arial 12 bold', command=ler_arquivo)
    botao_1.pack()

    label_4 = Label(janela, text='Conteúdo do arquivo:', font='Arial 12 bold',
                    anchor='center', bg='black', fg='white')
    label_4.pack()

    label_1_re = Label(janela, text='', font='Arial 12 bold', anchor='center', bg='black',
                       fg='white', wraplength=1000)
    label_1_re.pack(pady=10)

    botao_2 = Button(janela, text='Visualizar tokens reconhecidos', relief='raised', bg='white',
                     font='Arial 12 bold',
                     command=recognize)
    botao_2.pack()

    janela.mainloop()
