import psutil
qtdVezes = int(input("Digite quantas vezes você deseja ver os dados sobre a CPU: "))
qtdTempo = int(input("Digite de quanto em quanto tempo deseja ver essas informações(sec): "))

memoria = psutil.disk_usage('/')
qtdCPU = psutil.cpu_count(logical=False)
qtdCPUlogical = psutil.cpu_count()

print(f"\nmemória da máquina: {memoria}\n")
print(f"Sua máquina possui {qtdCPUlogical} Núcleos no total.\nSendo {qtdCPU} fisícos")
print("======================\n")

i = 0
while(i < qtdVezes):
        usoCPU = psutil.cpu_percent(interval = qtdTempo)
        print(f"Indo para {i+1}° vez:\n")
        print(f"Uso da CPU {usoCPU}%")
        print(psutil.cpu_freq())
        print(psutil.cpu_times())
        print("======================\n")
        i = i + 1
print("copyright João Victor Nunes Ribeiro.\nUm aluno Bandtec.")
