from scipy.integrate import odeint
import numpy as np

# Diferansiyel denklemin tanımlanması
def model(y, t):
    dydt = -2 * y
    return dydt

# Başlangıç koşulu
y0 = 5

# Zaman noktaları
t = np.linspace(0, 5)

# Diferansiyel denklemin çözülmesi
y = odeint(model, y0, t)

print(y)