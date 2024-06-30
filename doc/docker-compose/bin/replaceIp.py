# -*- coding:utf-8 -*-

import socket
import subprocess
import re
import io
def is_private_ip(ip):
    private_ip_ranges = [
        re.compile(r'10\.\d+\.\d+\.\d+'),
        re.compile(r'127\.\d+\.\d+\.\d+'),
        re.compile(r'172\.(1[6-9]|2\d|3[01])\.\d+\.\d+'),
        re.compile(r'192\.168\.\d+\.\d+')
    ]
    for pattern in private_ip_ranges:
        if pattern.match(ip):
            return True
    return False

def get_ip():
    p = subprocess.Popen("ifconfig", stdout=subprocess.PIPE)
    output = p.stdout.read()
    pattern = re.compile(r'inet (\d+\.\d+\.\d+\.\d+)')
    ips = pattern.findall(output)
    public_ips = [ip for ip in ips if not is_private_ip(ip)]
    private_ips = [ip for ip in ips if is_private_ip(ip)]
    private_ips.sort(key=lambda x: x.startswith('192.'), reverse=True)
    sorted_ips = public_ips + private_ips
    return sorted_ips

ips = get_ip()

print("当前系统的IP地址列表：")
print(ips)

ip_address = ips[0]
def is_private_ip(ip):
    ip_parts = ip.split('.')
    if ip_parts[0] == '10':
        return True
    elif ip_parts[0] == '172' and 16 <= int(ip_parts[1]) <= 31:
        return True
    elif ip_parts[0] == '192' and ip_parts[1] == '168':
        return True
    elif ip_parts[0] == '127':
        return True
    else:
        return False
print("系统选择IP地址:" + ip_address)
if is_private_ip(ip_address):
    print("该IP地址运行在局域网")
else:
    print("该IP地址运行在云服务器")

# 替换ip地址
def replace(file, newStr):
    fileData = ""
    with io.open(file, 'r', encoding='utf-8') as f:
        lines = f.readlines()
        # 查找到ip地址
        for line in lines:
            ipList = re.findall(r"\b(?:[0-9]{1,3}\.){3}[0-9]{1,3}\b", line)
            if not ipList == []:
                oldStr = ipList[0]
                print file, "替换ip地址:", oldStr, "->", newStr
                break
        # 替换ip地址
        for line in lines:
            line = line.replace(oldStr, newStr)
            fileData += line

    with io.open(file,"w",encoding="utf-8") as f:
        f.write(fileData)

replace("../config/vue_mogu_admin.env", ip_address)
replace("../config/vue_mogu_web.env", ip_address)