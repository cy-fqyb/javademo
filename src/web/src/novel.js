import fs from "fs/promises"; // 使用 'fs/promises' API 进行现代的基于 Promise 的操作
import path from "path";
import { fileURLToPath } from "url";
import axios from "axios"; // 确保已使用 'npm install axios' 安装 Axios

// 使用 fs.promises API 读取 .txt 文件的函数
async function readTextFile(filePath) {
	try {
		const data = await fs.readFile(filePath, "utf8");
		return data;
	} catch (err) {
		throw new Error(`Error reading file: ${err.message}`);
	}
}

// 使用 Axios 将小说内容保存到服务器的函数
async function saveNovelContent(content) {
	try {
		const response = await axios.post("https://example.com/api/novels", { content });
		return response.data;
	} catch (err) {
		throw new Error(`Error saving novel content: ${err.message}`);
	}
}

// 主函数处理读取和保存
async function processNovelFile(filePath) {
	try {
		// 读取文件内容
		const content = await readTextFile(filePath);

		// 打印文件内容
		console.log(content);

		// 调用函数将内容保存到服务器
		// await saveNovelContent(content);
	} catch (error) {
		console.error("Error:", error);
	}
}

// 获取当前文件的目录路径
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

// 指定 .txt 文件的路径，使用 __dirname 获取当前文件所在目录
const filePath = path.join(__dirname, "index.txt");

// 处理小说文件
processNovelFile(filePath);
