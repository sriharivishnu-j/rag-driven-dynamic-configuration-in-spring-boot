import React, { useState, useEffect } from 'react';
import { motion } from 'framer-motion';

const App: React.FC = () => {
    const [config, setConfig] = useState<string>('');

    useEffect(() => {
        fetch('/api/config')
            .then(response => response.json())
            .then(data => setConfig(JSON.stringify(data, null, 2)));
    }, []);

    return (
        <div className="p-10">
            <motion.div initial={{ opacity: 0 }} animate={{ opacity: 1 }} transition={{ duration: 1 }}>
                <h1 className="text-4xl font-bold mb-4">Dynamic Configuration</h1>
                <pre className="bg-gray-100 p-4 rounded-md shadow-md">
                    {config}
                </pre>
            </motion.div>
        </div>
    );
};

export default App;
